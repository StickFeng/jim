package com.jim.es.core.common.filter;

import com.jim.es.core.constants.BizConstants;
import com.jim.es.core.domain.user.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Jim
 * @date 12/15/2016
 * @version 1.0
 */
public class EsSessionFilter implements Filter{
    private static final Logger LOGGER = LoggerFactory.getLogger(EsSessionFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.error("filter init ===>>>");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String api = httpServletRequest.getRequestURI().replaceFirst(httpServletRequest.getContextPath(), "");
        if (api.startsWith("/html") || api.startsWith("/css") || api.startsWith("/js") || api.startsWith("/images") || api.startsWith("/lib")){
            chain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        HttpSession session = ((HttpServletRequest) request).getSession();
        UserInfo userInfo = (UserInfo) session.getAttribute(BizConstants.USER_INFO);
        if (userInfo != null){
            chain.doFilter(httpServletRequest, httpServletResponse);
        }else {
            ((HttpServletResponse) response).sendRedirect(httpServletRequest.getContextPath());
        }
    }

    @Override
    public void destroy() {

    }
}
