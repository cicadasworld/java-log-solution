package com.jin;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hujin
 * @version 2022/2/2
 */
public class LogTest {

    @Test
    public void testSpringLog() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
    }
}
