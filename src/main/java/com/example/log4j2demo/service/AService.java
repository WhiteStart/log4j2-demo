package com.example.log4j2demo.service;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Log4j2
public class AService {
//    private static final Logger logger = LogManager.getLogger(AService.class);

    @PostConstruct
    public void doSomething() {
        log.info("aaaaaa");
    }

    public void test() {
        log.info("++++a");
    }

    public void test2() {
        log.error("22222++++a");
    }
}

