package com.jim.es.core.common.errorHandler;

/**
 * Created by Dell on 2016/12/13.
 */
public abstract class AbstractErrorHandler<T extends Throwable> implements ErrorHandler{
    protected abstract void handleError(String targeClassName, String methodName, Object[] args, T e);

    @Override
    public void handle(String targetClassName, String methodName, Object[] args, Throwable e) {
        this.handleError(targetClassName, methodName, args, (T) e);
    }
}
