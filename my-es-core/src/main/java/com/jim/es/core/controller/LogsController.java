package com.jim.es.core.controller;

import com.jim.es.core.common.api.ResultBean;
import com.jim.es.core.constants.BizConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jim
 * @version 1.0
 * @date 12/12/2016
 * @description
 */
@RequestMapping("/logs")
@RestController
public class LogsController extends BaseController{

    @RequestMapping(value = "/get/user/info", method = RequestMethod.POST)
    public ResultBean getUserInfoAndTestLogs(){
        String name = (String) session.getAttribute(BizConstants.USER_INFO);
        return ResultBean.format(name);
    }
}
