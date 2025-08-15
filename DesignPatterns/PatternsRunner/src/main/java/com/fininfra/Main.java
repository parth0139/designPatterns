package com.fininfra;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final String STARS= "**************************** \n";

    static {
        LoggerSetup.setupLogger();
    }

    public static void main(String[] args) {
        logger.log(Level.INFO,"Starting Design Patterns Runner... \n");

        logger.log(Level.WARNING,"{0}Running Creational Patterns...\n{0}", STARS);
        Singleton.run();
        BuilderPattern.run();
        FactoryPattern.run();
        AbstractFactoryPattern.run();
        PrototypePattern.run();

        logger.log(Level.WARNING,"{0}Running Structural Patterns...\n{0}", STARS);
        DecoratorPattern.run();
        ProxyPattern.run();

        logger.log(Level.WARNING,"{0}Running Behavioural Patterns...\n{0}", STARS);
        StrategyPattern.run();
        ObserverPattern.run();

        logger.log(Level.INFO,"All patterns executed successfully...");

    }
}