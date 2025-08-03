package com.fininfra.impl;

import java.util.logging.Logger;

public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;
    private static final Logger logger = Logger.getLogger(DoubleCheckSingleton.class.getName());
    private DoubleCheckSingleton(){
    }

    public static void init(){
        if(instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                    logger.info("DoubleCheckSingleton instance created.");
                }
            }
        }
    }

    public static DoubleCheckSingleton getInstance() {
       if(instance != null) return instance;
       throw new IllegalStateException("Instance not initialized. Call init() first.");
    }
}
