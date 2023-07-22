package com.example.log4j2demo.service;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Log4j2
public class BService implements InitializingBean {
//    private static final Logger logger = LogManager.getLogger(BService.class);

    @PostConstruct
    public void doSomething(){
        log.info("BBB");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("BBBBBBB");
    }

    public void test(){
        log.info("++++b");
    }


    public void test2() {
        log.error("22222++++b");
    }
}
