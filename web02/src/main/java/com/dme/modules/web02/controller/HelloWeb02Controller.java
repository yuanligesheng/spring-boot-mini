package com.dme.modules.web02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Wang Haoyu
 * @Date 2024/12/3 22:48
 * @Version 1.0
 */
@RestController
public class HelloWeb02Controller {

    @RequestMapping("/helloWeb02")
    public String helloWeb01() {
        System.out.println("helloWeb02 -------------");
        return "helloWeb02";
    }
}
