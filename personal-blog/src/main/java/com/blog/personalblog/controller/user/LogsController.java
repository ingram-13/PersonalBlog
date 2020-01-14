package com.blog.personalblog.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LogsController {

    @RequestMapping("/logs/user/login")
    public String loginLogs(){

        return null;
    }
}
