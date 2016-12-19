package com.jim.es.core.common.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Jim
 * @date 12/15/2016
 * @version 1.0
 * @description aop打印business操作日志
 */
@Aspect
@Component
public class BusinessOptionHandlerAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessOptionHandlerAspect.class);

    @Pointcut("execution( * com.jim.es.core.business.*.(..))")
    public void query(){}

    @Before("query()")
    public void beforeOption(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String method = joinPoint.getSignature().getName();
        Object[] objects = joinPoint.getArgs();
        LOGGER.info("before :: {}.{} ===>>>{}", name, method, JSON.toJSON(objects));
    }

    @After("query()")
    public void afterOption(){}

    @AfterReturning(pointcut = "query()" ,returning = "result")
    public void afterReturnOption(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String method = joinPoint.getSignature().getName();

    }
}
