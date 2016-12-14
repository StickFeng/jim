package com.jim.es.core.service;

import com.jim.es.core.domain.user.UserInfo;
import com.jim.es.core.dto.UserDto;
import com.jim.es.core.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Jim
 * @date 12/01/2016
 * @version 1.0
 * @description
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Inject
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getUserInfos(UserDto userDto) {
        return userMapper.getUserInfo(userDto);
    }
}
