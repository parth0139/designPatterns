package com.fininfra;

import com.fininfra.intf.Shape;

public class ShapeFactory {
    private ShapeFactory() {}

    public static Shape getShape(String shape){
        if(shape==null){
            throw new IllegalArgumentException("Shape cannot be null");
        }
        if(shape.equalsIgnoreCase("Circle")){
            return new com.fininfra.impl.Circle();
        } else if(shape.equalsIgnoreCase("Rectangle")) {
            return new com.fininfra.impl.Rectangle();
        } else if(shape.equalsIgnoreCase("Triangle")) {
            return new com.fininfra.impl.Triangle();
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + shape);
        }
    }
}
