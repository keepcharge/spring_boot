package com.atmyc.spring_boot.controller;

import com.atmyc.spring_boot.test01.entity.User1;
import com.atmyc.spring_boot.test01.service.User1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class TranUserController {

    @Autowired
    private User1Service user1Service;

    @Autowired
    private CacheManager cacheManager;


    @RequestMapping("/tranUser")
    public String TranUser(String username,Integer age){
        user1Service.transUser(username,age);
        return  "success";
    }

    @RequestMapping("/findUser")
    public List findUser(){
        List<User1> user = user1Service.findUser();
        return user;

    }

    @RequestMapping("/remo")
    public String remo(){
        cacheManager.getCache("baseCache").clear();
        return  "clear success";
    }


}
