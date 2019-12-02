package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.service.ExMessageService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 15:48
 */@Controller
public class ExMessageController {

     @Resource
     ExMessageService exMessageService;

    @RequestMapping(value = "/exmessage/list")
    public String getAllUser(Model model) {
        List<ExMessage> allExMessage =  exMessageService.getAllExMessage();

        model.addAttribute("allExMessages", allExMessage);
        return "index";
    }

}
