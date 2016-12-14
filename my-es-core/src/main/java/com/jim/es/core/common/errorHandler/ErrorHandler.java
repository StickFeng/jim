package com.jim.es.core.common.errorHandler;

/**
 * @author Jim
 * @date 12/13/2016
 * @version 1.0
 */
public interface ErrorHandler {

    /**
     *
     * @param targetClassName 代理目标类全称
     * @param methodName 方法名
     * @param args 入参
     * @param e 异常信息
     */
    void handle(String targetClassName, String methodName, Object[] args, Throwable e);
}
