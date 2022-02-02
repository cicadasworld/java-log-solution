package com.jin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author hujin
 * @version 2022/2/2
 */
public class LogTest {

    /**
     * 1. -Dlog4j2.formatMsgNoLookups=true
     * 2. 升级log4j2到最新版本
     * @param args
     */
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("log4j2");
        logger.info("{} login successful", "${jndi:rmi://127.0.0.1:8088/look}");
    }
}
