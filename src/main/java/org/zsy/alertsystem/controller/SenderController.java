package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.service.ExMessageService;
import org.zsy.alertsystem.util.JsonRequestUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 15:08
 */

@Controller
public class SenderController {

    @Resource
    ExMessageService exMessageService;

    @ResponseBody
    @PostMapping(value = "/sender")
    public String sendMailToAdmin(HttpServletRequest request, HttpServletResponse response) {

        System.out.println(request);
        ExMessage exMessage = JsonRequestUtil.getPostJson(request, ExMessage.class);

        exMessageService.addExMessage(exMessage);

        System.out.println(exMessage);
        return exMessage.toString();
    }


    @GetMapping(value = "/test")
    public String test(@RequestParam(value = "sid") Long systemId,
                       @RequestParam(value = "eid") Long exId) {
        return String.format("已将系统%d的异常%d发送给相应负责人", systemId, exId);
    }



}
