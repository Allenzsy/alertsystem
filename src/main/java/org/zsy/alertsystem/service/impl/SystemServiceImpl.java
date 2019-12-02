package org.zsy.alertsystem.service.impl;

import org.springframework.stereotype.Service;
import org.zsy.alertsystem.dao.SystemMapper;
import org.zsy.alertsystem.dao.UserMapper;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.System;
import org.zsy.alertsystem.pojo.SystemExample;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.SystemService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 2:40
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Resource
    SystemMapper systemMapper;

    @Resource
    UserMapper userMapper;

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

    @Override
    public Map<String, System> getAllSystem() {
        SystemExample example = new SystemExample();
        SystemExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<System> listSystem = systemMapper.selectByExample(example);
        Map<String, System> map = new HashMap<>();
        for(System system : listSystem) {
            User user = userMapper.selectByPrimaryKey(system.getUserId());
            map.put(user.getUserName(), system);
        }
        return map;
    }
}
