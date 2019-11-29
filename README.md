# alertsystem

## 题目描述

中心银行实习题目一：预警中台

1. 为多个系统设计的一个web端预警中台，可以对预警信息进行增、删、查、改操作。预警信息格式自行设计，但需要包括以下内容：
   - 预警的系统名称	时间	异常描述

2. 可选实现项：
   - 预警信息的来源不依赖平台新增，有独立的Client端向Server端进行发送
   - 可以将预警信息以邮件形式发送给对应的系统负责人



## 解决方案

### 表设计

1. ExMessage 表

   system_id 和 ex_id 组成联合主键

| 字段名         | 描述                     |
| -------------- | ------------------------ |
| system_id      | 发出预警信息的系统id     |
| system_name    | 发出预警信息的系统名称   |
| ex_id          | 预警信息中异常类别id     |
| ex_time        | 预警信息中发生异常的时间 |
| ex_description | 预警信息中异常描述       |

3. Notice表

   system_id 和 ex_id 组成联合主键
   
   | 字段名     | 描述                 |
   | ---------- | -------------------- |
   | system_id  | 发出预警信息的系统id |
   | ex_id      | 预警信息中异常类别id |
   | admin_name | 负责人姓名           |
   | admin_mail | 负责人邮箱           |
   
   

### service层接口设计

1. ExMessageService接口:

   - 添加 系统n 发出的预警信息到数据库

     ```java
     void addExMessage(Integer systemId,
                       String systemName,
                       Integer exId,
                       String exDescription,
                       Date exTime);
     ```

   - 更新 系统n 发出的预警信息到数据库

     ```java
     // 在规定间隔后再次产生的预警信息，需要更新异常时间
     void updateExMessage(Integer systemId, Integer exId, Date newExTime);
     ```

   - 查询 系统n 在数据库中的信息

     ```java
     // 通过联合主键获取ExMessage对象
     ExMessage getExMessageByUniteId(Integer systemId, Integer exId);
     ```

   - 删除 系统n 在数据库中的信息

     ```java
     void deleteExMessage(Integer systemId, Integer exId);
     ```



2. SenderService接口:

   - 判断是否需要发送邮件给负责人

     ```java
     boolean checkNeedToSend(Date newExTime, ExMessage exMessage);
     ```

   - 发送预警信息给相应负责人

     ```java 
     void sendExMessage(ExMessage exMessage);
     ```