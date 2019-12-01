package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zsy.alertsystem.pojo.ExMessage;
import org.zsy.alertsystem.pojo.Rule;
import org.zsy.alertsystem.pojo.SenderLog;
import org.zsy.alertsystem.pojo.User;
import org.zsy.alertsystem.service.ExMessageService;
import org.zsy.alertsystem.service.RuleService;
import org.zsy.alertsystem.service.SenderService;
import org.zsy.alertsystem.service.UserService;
import org.zsy.alertsystem.util.JsonRequestUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 15:08
 */

@Controller
public class SenderController {

    @Resource
    ExMessageService exMessageService;

    @Resource
    RuleService ruleService;

    @Resource
    UserService userService;

    @Resource
    SenderService senderService;

    @ResponseBody
    @PostMapping(value = "/sender")
    public String sendMailToAdmin(HttpServletRequest request, HttpServletResponse response) {

        ExMessage exMessage = JsonRequestUtil.getPostJson(request, ExMessage.class);

        // 把预警信息入库
        exMessageService.addExMessage(exMessage);

        // 获取发送规则
        List<Rule> ruleList = ruleService.getRule(exMessage.getSystemId(), exMessage.getUserId(), exMessage.getRankId());

        // 判断是否需要发送通知
        List<Boolean> neenSendList = ruleService.checkNeedToSend(ruleList, exMessage);

        // 查询负责人信息
        User user = userService.getUser(exMessage.getUserId());

        int index = 0;
        for (boolean needSend:neenSendList) {
            if(needSend) {
                // 发送通知
                SenderLog senderLog = senderService.sendExMessage(ruleList.get(index).getSenderId(), user, exMessage);
                // 把通知日志入库
                System.out.println("通知入库");
            } else {
                // 不需要发通知
                System.out.println("不需要");
            }
            index++;
        }

        System.out.println(exMessage);
        return "{}";
    }


    @GetMapping(value = "/test")
    public String test(@RequestParam(value = "sid") Long systemId,
                       @RequestParam(value = "eid") Long exId) {
        return String.format("已将系统%d的异常%d发送给相应负责人", systemId, exId);
    }



}
