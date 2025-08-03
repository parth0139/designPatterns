package com.fininfra;

import java.util.logging.*;

public class ColoredFormatter extends Formatter {

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";

    @Override
    public String format(LogRecord record) {
        String color;

        switch (record.getLevel().getName()) {
            case "SEVERE":
                color = RED;
                break;
            case "WARNING":
                color = YELLOW;
                break;
            case "INFO":
                color = GREEN;
                break;
            case "CONFIG","FINE", "FINER", "FINEST":
                color = BLUE;
                break;
            default:
                color = RESET;
                break;
        }

        return color + "[" + record.getLevel() + "] " + formatMessage(record) + RESET + "\n";
    }
}
