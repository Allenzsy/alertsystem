package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 13:18
 */
@Controller
public class UserController {

    @Resource
    UserService userService;

    @GetMapping(value = "/user/list")
    public String getAllUser(Model model) {
        List<User> allMembers =  userService.getAllUser();

        model.addAttribute("allUsers", allMembers);
        return "index";
    }

}
