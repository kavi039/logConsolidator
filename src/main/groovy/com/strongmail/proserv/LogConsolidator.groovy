package com.strongmail.proserv;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

class LogConsolidator {

    private static Logger log = null;

    public static void main(String[] args) {
        initializeLogger();
        log.debug("project started.................");
    }

    private static void initializeLogger() {
        System.setProperty("org.apache.cxf.Logger", "org.apache.cxf.common.logging.Log4jLogger");
        System.setProperty("log4j.configurationFile", System.getProperty("logConfig"));
        log = LogManager.getLogger(LogConsolidator.class);
        log.debug("<- initializeLogger");
    }
}
