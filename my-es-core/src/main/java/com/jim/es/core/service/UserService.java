package com.jim.es.core.service;

import com.jim.es.core.domain.user.UserInfo;
import com.jim.es.core.dto.UserDto;

/**
 * @author Jim
 * @date 12/15/2016
 * @version 1.0
 */
public interface UserService {

    UserInfo getSingleUserDetail(UserDto userDto);
}
