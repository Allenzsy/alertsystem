
CREATE TABLE if not exists `t_seckill`(
    `seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
    `name` varchar(120) NOT NULL COMMENT '商品名称',
    `number` int NOT  NULL COMMENT '库存数量',
    `start_time` timestamp not NULL COMMENT '秒杀开启时间',
    `end_time` timestamp not NULL COMMENT '秒杀结束时间',
    `create_time` timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY PK_SECKILL_ID(seckill_id),
    key idx_start_time(start_time),
    key idx_end_time(end_time),
    key idx_create_time(create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET = utf8 COMMENT = '秒杀库存表';


CREATE TABLE if not exists `t_user`(
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar (120) NOT NULL,
    `password` varchar (120) NOT NULL,
    PRIMARY KEY PK_ID(id)
) ENGINE=InnoDB DEFAULT CHARSET = utf8;

insert into t_user (name, password) values ('zsy', '123123'),('wk', '123456');

CREATE TABLE if not  exists `t_exmessage` (
    `system_id` bigint NOT NULL COMMENT '系统id',
    `system_name` varchar (30) NOT NULL COMMENT '系统名称',
    `ex_id` bigint NOT NULL COMMENT '异常类别id',
    `ex_time` timestamp NOT NULL COMMENT '异常时间',
    `ex_description` varchar (120) NOT NULL COMMENT '异常描述',
    PRIMARY KEY (system_id, ex_id) /* 联合主键，对同一系统的同类型预警信息只存储一次*/
) ENGINE=InnoDB DEFAULT CHARSET = utf8;

CREATE TABLE if not  exists `t_notice` (
    `system_id` bigint NOT NULL COMMENT '系统id',
    `ex_id` bigint NOT NULL COMMENT '异常类别id',
    `admin_name` varchar (16) NOT NULL,
    `admin_mail` varchar (50) NOT NULL,
    PRIMARY KEY (system_id, ex_id) /* 联合主键，对同一系统的同类型预警信息只存储一次*/
) ENGINE=InnoDB DEFAULT CHARSET = utf8;

insert into t_notice values (10001, 34, '张经理', '986847686@qq.com');

select admin_name, admin_mail from t_notice where system_id=10001 and ex_id=34;
