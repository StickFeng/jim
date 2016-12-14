package com.jim.es.core.mapper;

import com.jim.es.core.domain.OperationLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 */
@Repository
public interface LogMapper {

    @Insert("insert into OPERATION_LOG(type, name, content, timestamp, create_time) values(#{log.type}, #{log.name}, #{log.content}, #{log.timestamp}, #{log.create_time})")
    void saveOperationLog(@Param("log") OperationLog operationLog);
}
