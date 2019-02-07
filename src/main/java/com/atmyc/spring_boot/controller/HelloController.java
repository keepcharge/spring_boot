package com.atmyc.spring_boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot 入门
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        log.info(">> 请求 hello");
        return "hello ,spring boot !!!";

    }

    @RequestMapping("/test")
    public  String test(){
        log.info(">> 请求test");
        int i = 1 /0;
        log.info(">> "+(1 /0));
        return  null;
    }


}
