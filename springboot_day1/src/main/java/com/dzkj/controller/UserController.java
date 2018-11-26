package com.dzkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("tologin")
    public String tologin(){
        return "login";
    }
}
