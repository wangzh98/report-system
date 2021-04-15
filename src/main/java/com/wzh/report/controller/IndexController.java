package com.wzh.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 需要模版引擎 thymeleaf
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("message", "hello,springboot");
        return "test";
    }
}
