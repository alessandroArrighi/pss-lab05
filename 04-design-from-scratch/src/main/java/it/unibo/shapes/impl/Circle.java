package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;
//import java.lang.Math;

public class Circle implements Shape {
    private double radius;
    
    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
