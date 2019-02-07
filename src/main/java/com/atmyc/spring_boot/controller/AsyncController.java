package com.atmyc.spring_boot.controller;

import com.atmyc.spring_boot.test01.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.util.resources.ga.LocaleNames_ga;

import javax.lang.model.element.NestingKind;

@Slf4j
@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @Value("${hetiao}")
    private String hetiao;


    @RequestMapping("/sendSms")
    public void sendSms(){
        log.info(">>>>>>获取属性文件值 hetiao ="+hetiao);
        log.info(">>>>>>step 1");
        asyncService.sndSms();
        log.info(">>>>>>step 4");
    }
}
