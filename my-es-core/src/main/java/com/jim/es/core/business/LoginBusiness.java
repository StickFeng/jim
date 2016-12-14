package com.jim.es.core.business;

import com.jim.es.core.dto.UserDto;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 * @description
 */
public interface LoginBusiness {
    /**
     * 用户登陆
     * @param userDto
     */
    boolean login(UserDto userDto);
}
