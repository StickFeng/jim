package com.jim.es.core.common;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 * @descriptiom
 */
public interface LogBusiness {
   /**
    * 保存操作日志
    * @param name
    * @param api
     */
   void saveApiOperation(String name, String api);
}
