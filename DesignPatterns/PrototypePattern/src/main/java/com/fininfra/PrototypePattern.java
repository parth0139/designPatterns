package com.fininfra;

import com.fininfra.documents.inpl.registry.DocumentRegistry;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * we can directly add copy constructor also in concrete classes and do deep copy there
 */
public class PrototypePattern {
    private PrototypePattern() {}
    private static final Logger logger = Logger.getLogger(PrototypePattern.class.getName());

    public static void run() {
        logger.log(Level.INFO, "Prototype Pattern demonstration...");

        DocumentRegistry.getPrototype(DocumentRegistry.RESUME);
        DocumentRegistry.getPrototype(DocumentRegistry.REPORT);

        logger.log(Level.INFO, "Prototype Pattern demonstration completed");
        logger.log(Level.INFO,"\n--------------------------------");
    }
}