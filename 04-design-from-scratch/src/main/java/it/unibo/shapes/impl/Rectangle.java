package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {
    private final static int NUMBER_OF_SIDES = 4;

    private double base;
    private double height;

    public Rectangle(final double base, final double height) {
        this.base = base;
        this.height = height;
    }

    public int getEdgeCount() {
        return NUMBER_OF_SIDES;
    }

    public double getArea() {
        return this.base * this.height;
    }

    public double getPerimeter() {
        return (2 * this.base) + (2 * this.height);
    }
}