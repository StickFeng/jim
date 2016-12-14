package com.jim.es.core.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Jim
 * @version 1.0
 * @date 12/12/2016
 * @description
 */
@Scope("request")
public abstract class BaseController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    @ModelAttribute
    public void init(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
        request = httpServletRequest;
        response = httpServletResponse;
        session = request.getSession(true);
    }

}

