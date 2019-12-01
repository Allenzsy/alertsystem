# AlertSystem

## 题目描述

中心银行实习题目一：预警中台

1. 为多个系统设计的一个web端预警中台，可以对预警信息进行增、删、查、改操作。预警信息格式自行设计，但需要包括以下内容：
   - 预警的系统名称	时间	异常描述

2. 可选实现项：
   - 预警信息的来源不依赖平台新增，有独立的Client端向Server端进行发送
   - 可以将预警信息以邮件形式发送给对应的系统负责人



## 解决方案

 <center>
         <span>
             <img src="https://github.com/Allenzsy/alertsystem/blob/master/pics/1.png" width="200px">
         </span>
 </center>

当预警信息请求到达后，先判断是否需要向相应负责人发送通知邮件，否则直接入库，是则发送通知邮件、记录发送时间、入库。

判断是否需要发送通知：通过 map 记录发送通知的时间，或者用表记录

发送通知邮件：用 system_id 查询相应负责人信息，发送通知。

### 预警信息字段设计

考虑到预警信息字段应该有如下信息：

- systemId：发出预警信息的系统 id
- token：用于验证系统，防止恶意调用预警中台暴露的接口
- rankId：预警级别 id
- exDescription：异常信息的描述
- exOccurtime：异常信息在系统发生的时间

### 表设计

1. t_exmessage 预警信息表

   用于存储系统发出的预警信息，当预警信息到达预警中台时入库，设计表格如下：

   | 字段名         | 描述                     |
   | -------------- | ------------------------ |
   | id             | 与业务无关自增id         |
   | system_id      | 发出预警信息的系统id     |
   | token          | 用于验证系统             |
   | rank_id        | 预警级别 id              |
   | user_id        | 负责人 id                |
   | ex_description | 异常信息的描述           |
   | ex_occurtime   | 异常信息在系统发生的时间 |
   | ex_createtime  | 预警信息入库时间         |

   在 id 建立自增主键，在 system_id 索引， 在 ex_occurtime建立索引加快查询排序

2. t_system 系统表

   | 字段名             | 描述                                         |
   | ------------------ | -------------------------------------------- |
   | id                 | 发出预警信息的系统 id                        |
   | system_name        | 系统名称                                     |
   | system_description | 系统描述                                     |
   | token              | 用于验证系统，防止恶意调用预警中台暴露的接口 |

4. t_user 负责人表

   | 字段名    | 描述       |
   | --------- | ---------- |
   | id        | 负责人 id  |
   | user_name | 负责人姓名 |
   | mail      | 邮箱       |
   | qq        | qq         |
   | phone     | 手机号     |

4. t_rule 发送通知规则表

   按照负责人设置的规则，发送通知。

   | 字段名    | 描述              |
   | --------- | ----------------- |
   | id        | 发送通知的规则 id |
   | frequency | 发送频率          |
   | rank_id   | 预警级别 id       |
   | system_id | 系统 id           |
   | user_id   | 负责人 id         |
   | sender_id | 发送通知器 id     |

7. t_sender 发送器配置表

   发送何种通知，例如 qq、微信和内部用的通讯软件。

   | 字段名 | 描述                       |
   | ------ | -------------------------- |
   | id     | 发送器 id                  |
   | config | 发送器配置，Json字符串形式 |

8. t_rank 预警级别表

   | 字段名 | 描述                               |
   | ------ | ---------------------------------- |
   | id     | 预警级别 id                        |
   | rank   | 预警级别 (e.g. error/warning/info) |

8. t_senderlog 发送器日志表

   用来记录已的发送通知，并利用发送通知规则判断是否需要发送

   | **字段名**   | 描述      |
   | ------------ | --------- |
   | id           | 日志 id   |
   | system_id    | 系统 id   |
   | user_id      | 负责人 id |
   | send_content | 发送内容  |
   | sendtime     | 发送时间  |



### service层接口设计

1. ExMessageService 接口:

   - 添加 系统n 发出的预警信息到数据库

     ```java
     void addExMessage(Integer systemId,
                       String systemName,
                       Integer exId,
                       String exDescription,
                       Date exTime);
     ```

   - 查询 系统n 在数据库中的信息

     ```java
     List<ExMessage> getExMessageByUniteId(Integer systemId, Integer exId);
     ```
   
     ```java
     ExMessage getExMessageById(Integer id);
     ```

   - 删除 系统n 在数据库中的信息
   
     ```java
     void deleteExMessage(Integer id);
     ```



2. SenderService 接口:

   - 判断是否需要发送邮件给负责人

     ```java
     boolean checkNeedToSend(Date newExTime, ExMessage exMessage);
     ```

   - 发送预警信息给相应负责人

     ```java 
     void sendExMessage(ExMessage exMessage);
     ```





ExMessageService : 

添加，删除， 修改，查询exmessage

提供一个入库服务

RuleService：

添加，删除， 修改，查询rule

提供依照规则判断是否需要发送通知服务

SenderService:

添加，删除，修改，查询sender

提供发送通知服务

UserSrvice:

添加，删除， 修改，查询user











