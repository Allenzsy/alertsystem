package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zsy.alertsystem.pojo.System;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.SystemService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 14:27
 */

@Controller
public class SystemController {

    @Resource
    SystemService systemService;

    @RequestMapping(value = "/system/list")
    public String getAllUser(Model model) {
        Map<String, System> allSystem =  systemService.getAllSystem();

        model.addAttribute("allSystems", allSystem);
        return "index";
    }

}
