package com.jim.es.core.service;

import com.jim.es.core.domain.user.UserInfo;
import com.jim.es.core.dto.UserDto;
import com.jim.es.core.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author Jim
 * @date 12/15/2016
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Inject
    private UserMapper userMapper;

    @Override
    public UserInfo getSingleUserDetail(UserDto userDto) {
        return userMapper.getSingleUserInfo(userDto);
    }
}
