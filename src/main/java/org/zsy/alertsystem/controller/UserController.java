package org.zsy.alertsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zsy.alertsystem.mapper.UserMapper;
import org.zsy.alertsystem.pojo.User;

import javax.annotation.Resource;

/**
 * @author allenzsy
 * @date 2019/11/28
 * @time 20:57
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    // 当使用get方法请求/user这个uri的时候，调用该方法
    @GetMapping
    public User findUser(@RequestParam(value = "id") Long id){
        return userMapper.findById(id);
    }

}
