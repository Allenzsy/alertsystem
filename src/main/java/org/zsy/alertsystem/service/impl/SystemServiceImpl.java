package org.zsy.alertsystem.service.impl;

import org.springframework.stereotype.Service;
import org.zsy.alertsystem.dao.SystemMapper;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.System;
import org.zsy.alertsystem.service.SystemService;

import javax.annotation.Resource;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 2:40
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Resource
    SystemMapper systemMapper;

    @Override
    public boolean checkSystem(ExMessage exMessage) {
        System system = systemMapper.selectByPrimaryKey(exMessage.getSystemId());
        if(system == null) {
            return false;
        }
        if(system.getToken().equals(exMessage.getToken())) {
            return true;
        }
        return false;
    }
}
