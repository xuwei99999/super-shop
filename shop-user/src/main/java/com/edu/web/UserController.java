package com.edu.web;

import com.edu.pojo.UserPojo;
import com.edu.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    IUserService userService;






    @RequestMapping("register")
    public String register(UserPojo userPojo){

        int num=userService.insertUser(userPojo);
        if(num!=0){
            System.out.println(1);
            return "redirect:register.html";
        }
        return "redirect:register.html";


    }



}
