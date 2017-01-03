package com.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private Logger logger = LoggerFactory.getLogger(LogTest.class);
    @Test
    public void logTest(){
        logger.trace("trace test");
        logger.debug("debug test");
        logger.info("info test");
        logger.warn("warn test");
        logger.error("error test");

        String name = "Piz";
        String message = "3KU";
        String[] fruits = { "apple", "banana" };

        // logback提供的可以使用变量的打印方式，结果为"Hello,Piz!"
        logger.info("Hello,{}!", name);

        // 可以有多个参数,结果为“Hello,Piz!   3KU!”
        logger.info("Hello,{}!   {}!", name, message);

        // 可以传入一个数组，结果为"Fruit:  apple, banana"
        logger.info("Fruit:  {},{}", (Object[]) fruits);
    }
}
