package com.jim.es.core.common.errorHandler.business;

import com.jim.es.core.common.errorHandler.AbstractErrorHandler;

import java.sql.SQLException;

/**
 * @author Jim
 * @date 12/13/2016
 * @version 1.0
 * @description 业务sql异常处理
 */
public class SQLExceptionErrorHandler extends AbstractErrorHandler<SQLException>{

    @Override
    protected void handleError(String targeClassName, String methodName, Object[] args, SQLException e) {

    }
}
