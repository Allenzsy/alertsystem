package org.zsy.alertsystem.service;

import org.zsy.alertsystem.pojo.User;

import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 14:49
 */
public interface UserService {

    User getUser(Integer id);

    List<User> getAllUser();

}
