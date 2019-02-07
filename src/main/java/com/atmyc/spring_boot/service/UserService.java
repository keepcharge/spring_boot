package com.atmyc.spring_boot.service;

import com.atmyc.spring_boot.entity.User;

public interface UserService {

    public void  createJdbcUser();

    public User getUsername(String username);

}
