package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {
    private final static int NUMBER_OF_SIDES = 4;

    private double side;

    public Square(final double side) {
        this.side = side;
    }

    public int getEdgeCount() {
        return NUMBER_OF_SIDES;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * NUMBER_OF_SIDES;
    }
}