package com.jim.es.core.common;

import com.jim.es.core.common.interceptor.Business;
import com.jim.es.core.constants.BizConstants;
import com.jim.es.core.domain.OperationLog;
import com.jim.es.core.mapper.LogMapper;

import javax.inject.Inject;
import java.util.Date;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 * @descriptiom
 */
@Business("logBusiness")
public class LogBusinessImpl implements LogBusiness{

    @Inject
    private LogMapper logMapper;

    public void saveApiOperation(String name, String api) {
        long timestamp = System.currentTimeMillis();
        OperationLog operationLog = OperationLog.builder()
                .type(BizConstants.LogCode.API)
                .name(name)
                .content(api)
                .timestamp(String.valueOf(timestamp))
                .create_time(new Date(timestamp))
                .build();
        logMapper.saveOperationLog(operationLog);
    }
}
