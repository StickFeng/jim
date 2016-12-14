package com.jim.es.core.util;

import org.joda.time.DateTime;

import java.util.UUID;

/**
 * @author Jim
 * @date 12/12/2016
 * @version 1.0
 * @description 唯一编号生成器
 */
public class Generator {

    public static String generatorNo(){
        return new DateTime().toString("yyyyMMddmmss") + UUID.randomUUID().toString().replace("-","");
    }
}
