package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;
import java.lang.Math;

public class Triangle implements Polygon{
    private static final int NUMBER_OF_SIDES = 3;

    private double side1;
    private double side2;
    private double side3;
    private double halfPerimeter;

    public Triangle(final double side1, final double side2, final double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.halfPerimeter = getPerimeter() / 2;
    }

    public int getEdgeCount() {
        return NUMBER_OF_SIDES;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        return Math.pow((this.halfPerimeter * (this.halfPerimeter - side1) * 
        (this.halfPerimeter - side2) * (this.halfPerimeter - side3)), (double)1/2);
    }
}