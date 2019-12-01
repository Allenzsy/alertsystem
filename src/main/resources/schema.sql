
-- t_exmessage 预警信息表
CREATE TABLE if not  exists `t_exmessage` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT '与业务无关自增id',
    `system_id` bigint NOT NULL COMMENT '发出预警信息的系统id',
    `token` char(10) NOT NULL COMMENT '用于验证系统',
    `rank_id` int  NOT NULL COMMENT '预警级别 id',
    `user_id` int  NOT NULL COMMENT '负责人 id',
    `ex_description` varchar (120) NOT NULL COMMENT '异常描述',
    `ex_occurtime` timestamp NOT NULL COMMENT '异常信息在系统发生的时间',
    `ex_createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '预警信息入库时间',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET = utf8;


-- t_system 系统表
CREATE TABLE if not  exists `t_system` (
    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '系统id',
    `system_name` varchar (16) NOT NULL COMMENT '系统名称',
    `system_description` varchar (50) NOT NULL COMMENT '系统描述',
    `user_id` int  NOT NULL COMMENT '负责人 id',
    `token` char(10) NOT NULL COMMENT '用于验证系统，防止恶意调用预警中台暴露的接口',
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET = utf8 COMMENT = '系统表';


-- t_user 负责人表
CREATE TABLE if not  exists `t_user` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT '负责人id',
    `user_name` varchar (16) NOT NULL COMMENT '负责人姓名',
    `mail` varchar (20) COMMENT '邮箱',
    `qq` varchar (20) COMMENT 'qq',
    `phone` varchar (20) COMMENT '手机号',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET = utf8 COMMENT = '负责人表';


-- t_rule 发送通知规则表
CREATE TABLE if not  exists `t_rule` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT '发送通知的规则 id',
    `frequency` int NOT NULL COMMENT '发送频率',
    `rank_id` bigint NOT NULL COMMENT '预警级别 id',
    `system_id` bigint NOT NULL COMMENT '系统 id',
    `user_id` int NOT NULL COMMENT '负责人 id',
    `sender_id` int NOT NULL COMMENT '发送通知器 id',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET = utf8 COMMENT = '发送通知规则表';


-- t_sender 发送器配置表
CREATE TABLE if not  exists `t_sender` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT '发送通知的规则 id',
    `config` varchar(400) NOT NULL COMMENT '发送器配置，Json字符串形式',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET = utf8 COMMENT = '发送器配置表';


-- t_rank 预警级别表
CREATE TABLE if not  exists `t_rank` (
    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '预警级别 id',
    `rank_name` varchar(10) NOT NULL COMMENT '预警级别 (e.g. error/warning/info)',
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=200 DEFAULT CHARSET = utf8 COMMENT = '预警级别表';


CREATE TABLE if not  exists `t_senderlog` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT '日志 id',
    `system_id` bigint NOT NULL COMMENT '发出预警信息的系统id',
    `user_id` int  NOT NULL COMMENT '负责人 id',
    `send_content` varchar (120) NOT NULL COMMENT '通知内容',
    `sendtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发送时间',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET = utf8;


SELECT CONCAT('DROP TABLE ', table_name,';') FROM information_schema.`TABLES` WHERE table_schema='alertsystem';


-- -- t_system_user 系统-负责人映射表
-- CREATE TABLE if not  exists `t_system_user` (
--     `system_id` bigint NOT NULL COMMENT '系统id',
--     `user_id` int (16) NOT NULL COMMENT '负责人id',
--     PRIMARY KEY (system_id, user_id)
-- ) ENGINE=InnoDB DEFAULT CHARSET = utf8 COMMENT = '系统-负责人映射表';

-- -- t_rule_user 发送通知规则-负责人映射表
-- CREATE TABLE if not  exists `t_rule_user` (
--     `rule_id` int NOT NULL COMMENT '发送通知的规则 id',
--     `user_id` int NOT NULL COMMENT '负责人id',
--     PRIMARY KEY (user_id, rule_id)
-- ) ENGINE=InnoDB DEFAULT CHARSET = utf8 COMMENT = '发送通知规则-负责人映射表';

    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '系统id',
    `system_name` varchar (16) NOT NULL COMMENT '系统名称',
    `system_description` varchar (50) NOT NULL COMMENT '系统描述',
    `token` char(10) NOT NULL COMMENT '用于验证系统，防止恶意调用预警中台暴露的接口',


insert into t_rule (frequency, user_id, system_id, rank_id, sender_id)values (2, 1, 1000, 200, 1);
insert into t_system (system_name, system_description, user_id, token)values ('风险控制系统', '负责进行风险控制', 1, 'FXKZ123');
insert into t_user (user_name, mail, qq, phone) VALUES ('张经理', '986847686@qq.com', 986847686, 13241305509);
insert into t_rank (rank_name) VALUES ('error');


insert into t_sender (config) VALUES ('{"method": "mail", "mail.smtp.host":“smtp.qq.com”, "mail.smtp.port":"587","mail.user":"986847686@qq.com", "mail.password":"tsrhhokyrmblbcac"}');




insert into t_notice values (10001, '张经理', '986847686@qq.com');

select admin_name, admin_mail from t_notice where system_id=10001 and ex_id=34;
