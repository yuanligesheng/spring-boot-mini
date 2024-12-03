package com.dme.modules.web01.controller;

import com.dme.modules.service.TestService;
import com.dme.modules.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Wang Haoyu
 * @Date 2024/12/3 22:46
 * @Version 1.0
 */
@RestController
public class HelloWeb01Controller {

    @Autowired
    private TestService testService;

    @RequestMapping("/helloWeb01")
    public String helloWeb01() {
        testService.testServiceFunction();
        TestServiceImpl testServiceImpl = new TestServiceImpl();
        testServiceImpl.testServiceFunction();
        //testService.testServiceFunction();
        System.out.println("helloWeb01 -------------");
        return "helloWeb01";
    }
}
