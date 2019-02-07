package com.atmyc.spring_boot.test01.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class AsyncService {


    @Async
    public void sndSms(){
        log.info(">>>>>> step 2");
        for (int i =0 ; i< 5 ; i++){
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }finally {

            }
            log.info(">>>>>> i =  "+ i);

        }

        log.info(">>>>>> step 3");
    }
}
