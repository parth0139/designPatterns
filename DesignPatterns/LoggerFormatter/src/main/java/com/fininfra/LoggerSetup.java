package com.fininfra;

import java.util.logging.*;

public class LoggerSetup {
    public static void setupLogger() {
        Logger rootLogger = Logger.getLogger("");

        for (Handler handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }

        // Create custom console handler
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new ColoredFormatter());
        rootLogger.addHandler(handler);
    }
}

