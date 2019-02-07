package com.atmyc.spring_boot.test02.service;

import com.atmyc.spring_boot.test02.dao.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User2Service {

    @Autowired
    private User2Mapper user2Mapper;

    public int addUser(String username,Integer age){
        return user2Mapper.addUser(username,age);
    }
}
