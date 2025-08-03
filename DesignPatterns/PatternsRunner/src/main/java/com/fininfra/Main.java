package com.fininfra;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    static {
        LoggerSetup.setupLogger();
    }
    
    public static void main(String[] args) {
        logger.log(Level.INFO,"Starting Design Patterns Runner... \n");

        StrategyPattern.run();

        Singleton.run();

        ObserverPattern.run();

        DecoratorPattern.run();

        FactoryPattern.run();

        AbstractFactoryPattern.run();

        logger.log(Level.INFO,"All patterns executed successfully...");

    }
}