package com.fininfra;

import com.fininfra.impl.DoubleCheckSingleton;
import com.fininfra.impl.EnumFinalSingleton;
import com.fininfra.impl.EnumSingleton;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Singleton {
    private static final Logger logger = Logger.getLogger(Singleton.class.getName());
    
    private Singleton(){}
    
    public static void run(){

        logger.log(Level.INFO, "Starting Singleton Pattern demonstration");
        
        DoubleCheckSingleton.init();
        DoubleCheckSingleton.getInstance();

        EnumSingleton.INSTANCE.setValues("jdbc:mysql://localhost:3306/sample", 10);

        EnumFinalSingleton.INSTANCE.setValues("jdbc:mysql://localhost:3306/sampleFinal", 10);
        EnumFinalSingleton.INSTANCE.setValues("jdbc:mysql://localhost:3306/sampleFinalAgain", 15);
        
        logger.log(Level.INFO, "Singleton Pattern demonstration completed");
        logger.log(Level.INFO,"\n--------------------------------");
    }
}