package com.jim.es.core.common.interceptor;

import org.springframework.stereotype.Component;

import java.lang.annotation.Inherited;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 * @description
 */
@Component
@Inherited
public @interface Business {
    String value() default "";
}
