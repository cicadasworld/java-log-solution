package com.jin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.LogManager;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hujin
 * @version 2022/2/2
 */
public class LogTest {

    @Test
    public void testJCL() {
        // JCL: Apache Commons Logging
        // JUL: Java Util Logging
        // use JUL logging
        Log log = LogFactory.getLog("JCL");
        log.info("It is info log.");
    }

    @Test
    public void testSLF4J() {
        // SLF4J: Simple Logging Facade for Java
        Logger logger = LoggerFactory.getLogger("SLF4J");
        logger.info("It is info log.");

        org.apache.log4j.Logger log4jLogger = LogManager.getLogger("Log4j");
        log4jLogger.info("It's info log.");
    }
}
