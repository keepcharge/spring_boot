package com.atmyc.spring_boot.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 拦截异常
 */
@Slf4j
@ControllerAdvice
public class GlobalExcepetionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandle(){
        Map<String,Object> message = new HashMap<String, Object>();
        message.put("code","300");
        message.put("message","系统繁忙");
        return message;

    }
}
