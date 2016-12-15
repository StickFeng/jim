package com.jim.es.core.business;

import com.alibaba.dubbo.common.json.JSON;
import com.jim.es.core.common.api.ServiceException;
import com.jim.es.core.common.interceptor.Business;
import com.jim.es.core.constants.ServiceCode;
import com.jim.es.core.domain.user.UserInfo;
import com.jim.es.core.dto.UserDto;
import com.jim.es.core.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * @author Jim
 * @date 12/15/2016
 * @version 1.0
 */
@Business("userBusiness")
public class UserBusinessImpl implements UserBusiness{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserBusinessImpl.class);

    @Inject
    private UserService userService;

    @Override
    public UserInfo getUserInfoDetail(UserDto userDto) throws Exception{
        LOGGER.info("用户信息===>>>" + JSON.json(userDto));
        if(userDto == null || StringUtils.isBlank(userDto.getName())){
            throw new ServiceException(ServiceCode.ILLEGAL_PARAM, "参数错误");
        }
        return userService.getSingleUserDetail(userDto);
    }
}
