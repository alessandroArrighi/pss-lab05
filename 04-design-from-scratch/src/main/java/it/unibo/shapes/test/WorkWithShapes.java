package it.unibo.shapes.test;

import it.unibo.shapes.api.Shape;
import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {
    public static void printData(final Shape shape) {
        System.out.println("#####################" + "\n");
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        Shape shape2 = new Rectangle(5, 2);
        Shape shape3 = new Square(8);
        Shape shape4 = new Triangle(8, 6, 4);

        printData(shape1);
        printData(shape2);
        printData(shape3);
        printData(shape4);
    }
}
