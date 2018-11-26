package com.dzkj.controller;

import com.dzkj.entity.User;
import com.dzkj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("tologin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("login")
    public String login(User user){
        User loginUser = userService.login(user);
        if(loginUser == null){
            System.out.println("登录失败");
            return "redirect:tologin";
        }
        System.out.println("登录成功");
        return null;
    }
}
