package com.example.log4j2demo.controller;

import com.example.log4j2demo.service.AService;
import com.example.log4j2demo.service.BService;
import com.example.log4j2demo.service.CService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger logger = LogManager.getLogger(TestController.class);

    private AService aService;
    private BService bService;
    private CService cService;

    public TestController(AService aService, BService bService, CService cService) {
        this.aService = aService;
        this.bService = bService;
        this.cService = cService;
    }

    @GetMapping("/test")
    public void test(){
        aService.test();
        bService.test();
        cService.test();
    }

    @GetMapping("/test2")
    public void test2(){
        aService.test2();
        bService.test2();
        cService.test2();
    }

    @GetMapping("/test3")
    public void test3(){
        logger.error("123456");
    }
}
