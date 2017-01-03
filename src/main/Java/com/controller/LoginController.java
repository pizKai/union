package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.ResponseWrapper;

/**
 * 登录控制
 * Created by Administrator on 2016/12/30.
 */
@Controller
public class LoginController {
    private  static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping(value="/login.do")
    public ModelAndView index(HttpServletRequest request) {
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        logger.info("{},login ...;this pwd is {}",name,pwd);
        return new ModelAndView("index1");
    }

}
