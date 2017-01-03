package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * test
 * Created by Administrator on 2016/12/7.
 */
@Controller
public class ControlerTest {
    private  static Logger logger = LoggerFactory.getLogger(ControlerTest.class);
    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        logger.error("helloWord!1");
        request.getParameter("ad");
        return new ModelAndView("index1");
    }

    public static void main(String[] args) {
        logger.info("helloWord!");
        logger.info("helloWord!!");
    }
}
