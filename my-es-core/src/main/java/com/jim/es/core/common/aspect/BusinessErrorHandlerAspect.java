package com.jim.es.core.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Jim
 * @date 12/13/2016
 * @version 1.0
 * @description 业务异常拦截切面
 */
@Component
@Aspect
public class BusinessErrorHandlerAspect {
    private final static Logger LOGGER = LoggerFactory.getLogger(BusinessErrorHandlerAspect.class);

    @Pointcut(value="execution(* com.jim.es.core.business.*.*(..))")
    public void query(){}

    @AfterThrowing(pointcut = "query()", throwing = "ex")
    public void doAfterThrowingTask(JoinPoint joinPoint, Exception ex){
        String name = joinPoint.getSignature().getDeclaringType().getSimpleName();
        LOGGER.error(name,ex);
    }
}
