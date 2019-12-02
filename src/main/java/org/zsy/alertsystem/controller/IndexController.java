package org.zsy.alertsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author allenzsy
 * @date 2019/12/1
 * @time 17:16
 */

@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String show(Model model) {
        return "index";
    }
}
