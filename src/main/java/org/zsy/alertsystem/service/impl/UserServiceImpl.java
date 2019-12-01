package org.zsy.alertsystem.service.impl;

import org.springframework.stereotype.Service;
import org.zsy.alertsystem.dao.UserMapper;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.UserService;

import javax.annotation.Resource;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 14:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
