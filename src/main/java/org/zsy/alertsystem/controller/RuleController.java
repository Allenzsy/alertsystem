package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zsy.alertsystem.pojo.Rule;
import org.zsy.alertsystem.service.RuleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author allenzsy
 * @date 2019/12/2
 * @time 16:43
 */
@Controller
public class RuleController {

    @Resource
    RuleService ruleService;

    @GetMapping(value = "/rule/list")
    public String getAllUser(Model model) {
        List<Rule> allRules =  ruleService.getAllRule();

        model.addAttribute("allRules", allRules);
        return "index";
    }
}
