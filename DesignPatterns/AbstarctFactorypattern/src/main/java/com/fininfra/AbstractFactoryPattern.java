package com.fininfra;

import com.fininfra.impl.LinuxFactory;
import com.fininfra.impl.WindowsFactory;
import com.fininfra.intf.OsFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In Factory pattern we create objects based on certain input.
 * BUt in Abstract Factory pattern we create a family of related objects without specifying their concrete classes.
 * In this pattern instead of getting obj, we get a factory in return, then from that factory we create
 * related objects of that particular family.
 */

public class AbstractFactoryPattern {
    private static final Logger logger = Logger.getLogger(AbstractFactoryPattern.class.getName());
    private static final String WINDOWS = "windows";
    private static final String LINUX = "linux";

    public static void run()
    {
        logger.log(Level.INFO, "Running Abstract Factory Pattern...");

        String requiredOs="windows";

        if(requiredOs.equalsIgnoreCase(WINDOWS)){
            logger.log(Level.INFO, "Creating Windows Operating System...");
            OsFactory factory = new WindowsFactory();
            OperatingSystem os = new OperatingSystem(factory);
            os.runAll();
        }else if(requiredOs.equalsIgnoreCase(LINUX)){
            logger.log(Level.INFO, "Creating Linux Operating System...");
            OsFactory factory = new LinuxFactory();
            OperatingSystem os = new OperatingSystem(factory);
            os.runAll();
        }else{
            logger.log(Level.WARNING, "Unsupported OS type. Please choose either 'windows' or 'linux'.");
        }

        logger.log(Level.INFO, "Completed Abstract Factory Pattern...");
        logger.log(Level.INFO, "\n-------------------------------- ");
    }
}