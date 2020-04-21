package com.lagou.edu.interceptor;

import com.alibaba.druid.util.StringUtils;
import com.lagou.edu.pojo.Resume;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆拦截器，只有登录过才能访问，没有登录则跳转登录界面
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        // 获取请求的url
        String url = httpServletRequest.getRequestURI();
        HttpSession session = httpServletRequest.getSession();
        String name = (String) session.getAttribute("resume");
        if (StringUtils.equals(url, "/login") || StringUtils.equals(url, "/main") || name != null) {
            // 登陆接口，放行
            return true;
        } else {
            // 不符合条件的跳转到登录界面
            // 客户端跳转
            httpServletResponse.sendRedirect("/main");
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
