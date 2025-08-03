package com.fininfra.intf;

import java.util.logging.Logger;

public interface Shape {
    Logger logger = Logger.getLogger(Shape.class.getName());
    void draw();
}
