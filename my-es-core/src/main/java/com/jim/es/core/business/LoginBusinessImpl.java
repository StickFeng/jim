package com.jim.es.core.business;

import com.jim.es.core.common.interceptor.Business;
import com.jim.es.core.dto.UserDto;
import com.jim.es.core.service.LoginService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 * @description
 */
@Business("loginBusiness")
public class LoginBusinessImpl implements LoginBusiness{
    private final static Logger LOGGER = LoggerFactory.getLogger(LoginBusinessImpl.class);
    @Inject
    private LoginService loginService;

    @Override
    public boolean login(UserDto userDto) {
        LOGGER.info("用户信息===>>>" + userDto);
       if (CollectionUtils.isEmpty(loginService.getUserInfos(userDto))){
           return false;
       }
        return true;
    }
}
