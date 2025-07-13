package api_automation.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {


    private static final Logger oLog = LogManager.getLogger();
    public static void info(String message){
        oLog.info(message);

    }
    public static void warn(String message){
        oLog.info(message);

    }
    public static void error(String message){
        oLog.info(message);

    }
    public static void trace(String message){
        oLog.info(message);
    }
    public static void debug(String message){
        oLog.info(message);
    }
}
