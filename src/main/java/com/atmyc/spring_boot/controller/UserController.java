package com.atmyc.spring_boot.controller;

import com.atmyc.spring_boot.entity.User;
import com.atmyc.spring_boot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 整合mybatis
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/createUser")
    public  String createJdbcUser(){
        userService.createJdbcUser();
        return  "add success";
    }

    @RequestMapping("/getUsername")
    public User getUsername(String username){
        return  userService.getUsername(username);
    }
}
