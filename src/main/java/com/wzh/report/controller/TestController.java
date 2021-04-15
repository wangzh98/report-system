package com.wzh.report.controller;

import com.wzh.report.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("getuser")
    @ResponseBody
    public User getUser() {
        User user = new User("111", "abc");
        return user;
    }
}
