package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {
    private final static int NUMBER_OF_SIDES = 4;

    private double lognSide;
    private double shortSide;

    public Rectangle(final double lognSide, final double shortSide) {
        this.lognSide = lognSide;
        this.shortSide = shortSide;
    }

    public int getEdgeCount() {
        return NUMBER_OF_SIDES;
    }

    public double getArea() {
        return this.lognSide * this.shortSide;
    }

    public double getPerimeter() {
        return (2 * this.lognSide) + (2 * this.shortSide);
    }
}