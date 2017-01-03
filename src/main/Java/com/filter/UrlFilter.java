package com.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1.过滤器,过滤地址栏地址
 * Created by Administrator on 2016/12/29.
 */
public class UrlFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(UrlFilter.class);
    private FilterConfig config = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        config = filterConfig;
        logger.info("UrlFilter初始化...");

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("doFilter执行中...");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 获取web.xm设置的编码集，设置到Request、Response中         request.setCharacterEncoding(config.getInitParameter("charset"));          response.setContentType(config.getInitParameter("contentType"));          response.setCharacterEncoding(config.getInitParameter("charset"));
        // 将请求转发到目的地
        filterChain.doFilter(request, response);
    }

    public void destroy() {
        logger.info("UrlFilter销毁...");
    }
}
