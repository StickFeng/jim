package com.jim.es.core.util;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

/**
 * @author Jim
 * @date 12/19/2016
 * @version 1.0
 * @description
 */
public class CommonUtil {

    public static String convert(Object object){
        if (StringUtils.isEmpty(object)){
            return "null";
        }
        if (object instanceof String){
            return object.toString();
        }
        String temp;
        try {
            temp = JSON.toJSONString(object);
        }catch (Exception e){
            temp = String.valueOf(object);
        }
        return temp;
    }
}
