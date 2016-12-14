package com.jim.es.core.common.errorHandler.business;

import com.jim.es.core.common.errorHandler.ErrorHandler;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务异常处理器工厂
 */
public enum BusinessErrorHandlerFactory {

    INSTANCE;

    private Map<Class<? extends Throwable>, ErrorHandler> errorHandlerMap;
    private BusinessErrorHandlerFactory(){
        this.errorHandlerMap = new HashMap<Class<? extends Throwable>, ErrorHandler>();
        this.errorHandlerMap.put(SQLException.class, new SQLExceptionErrorHandler());
    }

    public ErrorHandler get(Class<? extends Throwable> clazz){
        return this.errorHandlerMap.get(clazz);
    }
}
