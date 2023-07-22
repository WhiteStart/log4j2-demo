package com.example.log4j2demo.aop;

import org.apache.logging.log4j.ThreadContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.example.log4j2demo.service.*.*(..))")
    public void beforeServiceMethodExecution(JoinPoint joinPoint) {
        // 在Service方法执行前执行的逻辑
        String serviceName = joinPoint.getTarget().getClass().getSimpleName();
        ThreadContext.put("ROUTINGKEY", serviceName);
    }

    @After("execution(* com.example.log4j2demo.service.*.*(..))")
    public void afterServiceMethodExecution(JoinPoint joinPoint) {
        // 在Service方法执行后执行的逻辑
        ThreadContext.clearMap();
    }
}

