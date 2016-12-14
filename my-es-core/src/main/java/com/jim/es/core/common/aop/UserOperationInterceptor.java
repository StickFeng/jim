package com.jim.es.core.common.aop;

import com.jim.es.core.common.LogBusiness;
import com.jim.es.core.constants.BizConstants;
import com.jim.es.core.domain.user.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 * @description
 */
public class UserOperationInterceptor implements HandlerInterceptor{

    private final static Logger LOGGER = LoggerFactory.getLogger(UserOperationInterceptor.class);

    @Inject
    private LogBusiness logBusiness;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String api = request.getRequestURI().replaceFirst(request.getContextPath()+ BizConstants.API_REG, "");
        UserInfo userInfo = (UserInfo) session.getAttribute(BizConstants.USER_INFO);
        if (api.startsWith("/login") || api.startsWith("/logout")){
            return true;
        }
        logBusiness.saveApiOperation(userInfo.getName(), api);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
