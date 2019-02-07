package com.atmyc.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用freemark
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "hetiao");
        return "index";
    }

}
