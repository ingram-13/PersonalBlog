package com.blog.personalblog.controller.user;


import com.blog.personalblog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/login")
    public String login(){

        return "homepage";
    }



}
