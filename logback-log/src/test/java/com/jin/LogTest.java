package com.jin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hujin
 * @version 2022/2/2
 */
public class LogTest {

    @Test
    public void testSLF4J() {
        // SLF4J: Simple Logging Facade for Java
        Logger logger = LoggerFactory.getLogger("SLF4J");
        logger.info("It is info log.");
    }

    @Test
    public void testJCL() {
        // JCL: Apache Commons Logging
        // JUL: Java Util Logging
        Log log = LogFactory.getLog("JCL");
        log.info("It is info log.");
    }
}
