package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zsy.alertsystem.pojo.SenderLog;
import org.zsy.alertsystem.service.SenderLogService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 16:23
 */
@Controller
public class SenderLogController {

    @Resource
    SenderLogService senderLogService;

    @GetMapping(value = "/senderLog/list")
    public String getAllUser(Model model) {
        List<SenderLog> allSenderLog =  senderLogService.getAllSenderLog();

        model.addAttribute("allSenderLogs", allSenderLog);
        return "index";
    }

}
