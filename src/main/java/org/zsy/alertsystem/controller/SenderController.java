package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.util.JsonRequestUtil;

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

    @GetMapping(value = "/senderGet")
    public String sendMailToAdmin1(@RequestParam(value = "sid") Long systemId,
                                  @RequestParam(value = "sname") String systemName,
                                  @RequestParam(value = "eid") Long exId,
                                  @RequestParam(value = "etime") Date exTime,
                                  @RequestParam(value = "edesc") String exDescription) {



        return String.format("已将系统%d的异常%d发送给相应负责人", systemId, exId);
    }

    @ResponseBody
    @PostMapping(value = "/sender")
    public String sendMailToAdmin(HttpServletRequest request, HttpServletResponse response) {

        System.out.println(request);
        ExMessage exMessage = JsonRequestUtil.getPostJson(request, ExMessage.class);

        System.out.println(exMessage);
        return exMessage.toString();
    }



}
