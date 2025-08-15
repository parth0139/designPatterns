package com.fininfra;

import com.fininfra.intf.Shape;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FactoryPattern {
    private FactoryPattern(){}
    private static final Logger logger = Logger.getLogger(FactoryPattern.class.getName());
    public static void run() {
        logger.log(Level.INFO, "Running Factory Pattern...");

        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = ShapeFactory.getShape("TRIANGLE");
        triangle.draw();

        logger.log(Level.INFO, "Completed Factory Pattern...");
        logger.log(Level.INFO, "\n-------------------------------- ");
    }
}