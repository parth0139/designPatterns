package com.fininfra.impl;

import com.fininfra.intf.Shape;

import java.util.logging.Level;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        logger.log(Level.INFO,"Drawing a Rectangle");
    }
}
