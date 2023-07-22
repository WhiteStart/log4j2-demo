通过AOP将 ThreadContext 切入对应的包，单独输出日志

```java
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
```

