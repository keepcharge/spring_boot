package com.atmyc.spring_boot.task;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

@Component
public class ScheduledTask {

    @Scheduled(fixedRate = 1000)  //每秒执行
    public void add(){
        System.out.println(">>>>>>>do---->>>>>>>  "+System.currentTimeMillis());
    }
}
