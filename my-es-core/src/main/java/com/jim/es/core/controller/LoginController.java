package com.jim.es.core.controller;

import com.jim.es.core.business.LoginBusiness;
import com.jim.es.core.common.api.ResultBean;
import com.jim.es.core.constants.BizConstants;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultBean login(@RequestBody UserDto userDto){
        boolean result = loginBusiness.login(userDto);
        if (result){
            session.setAttribute(BizConstants.USER_INFO, userDto.getName());
        }
        return ResultBean.format(result);
    }
}
