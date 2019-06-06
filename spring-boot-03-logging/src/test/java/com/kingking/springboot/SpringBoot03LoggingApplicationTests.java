package com.kingking.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void contextLoads() {
        logger.trace("这是 trace 日志信息");

        logger.debug("这是 debug 日志界别");


        logger.info("这是  info  日志级别");

        logger.warn("这是 warn 日志级别");

        logger.error("这是  error 日志级别");



    }

}
