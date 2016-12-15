package com.jim.es.core.controller;

import com.jim.es.core.business.LoginBusiness;
import com.jim.es.core.business.UserBusiness;
import com.jim.es.core.common.api.ResultBean;
import com.jim.es.core.common.api.ServiceException;
import com.jim.es.core.constants.BizConstants;
import com.jim.es.core.constants.ServiceCode;
import com.jim.es.core.domain.user.UserInfo;
import com.jim.es.core.dto.UserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @author Jim
 * @version 1.0
 * @date 12/12/2016
 * @description
 */
@RestController
@RequestMapping
public class LoginController extends BaseController{

    @Inject
    private LoginBusiness loginBusiness;

    @Inject
    private UserBusiness userBusiness;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultBean login(@RequestBody UserDto userDto){
        boolean result = loginBusiness.login(userDto);
        if (result){
            try {
                UserInfo userInfo = userBusiness.getUserInfoDetail(userDto);
                session.setAttribute(BizConstants.USER_INFO, userInfo);
            }catch (Exception e){
                throw new ServiceException(ServiceCode.SYSTEM_ERROR, "Json转换错误");
            }
        }
        return ResultBean.format(result);
    }
}
