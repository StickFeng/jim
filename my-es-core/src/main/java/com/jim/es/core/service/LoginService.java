package com.jim.es.core.service;

import com.jim.es.core.domain.user.UserInfo;
import com.jim.es.core.dto.UserDto;

import java.util.List;

/**
 * @author Jim
 * @date 12/01/2016
 * @version 1.0
 * @description
 */
public interface LoginService {
    /**
     * 查询用户信息
     * @param userDto
     */
    List<UserInfo> getUserInfos(UserDto userDto);
}
