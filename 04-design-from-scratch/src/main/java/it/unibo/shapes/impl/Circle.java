package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;

public class Circle /*implements Shape*/ {
    private final static double PI_NUMBER = 3.14;

    private double radius;
    
    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI_NUMBER * (this.radius * this.radius);
    }

    public double getPerimeter() {
        return 2 * PI_NUMBER * this.radius;
    }
}
