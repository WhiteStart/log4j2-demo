package com.example.log4j2demo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CService implements InitializingBean {
//    private static final Logger logger = LogManager.getLogger(CService.class);

    public void test(){
        log.info("++++c");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("CCCCC");
    }


    public void test2() {
        log.error("22222++++c");
    }
}
