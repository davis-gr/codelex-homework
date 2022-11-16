package io.codelex.oop.shapes;

public class Calculator {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 2, 6);
        Triangle triangle = new Triangle(3, 2.6, 4.2);

        System.out.printf("%.2f\n", rectangle.getPerimeter());
        System.out.printf("%.2f\n", rectangle.getArea());
        System.out.println(rectangle.getNumSides());

        System.out.printf("%.2f\n", triangle.getPerimeter());
        System.out.printf("%.2f\n", triangle.getArea());
        System.out.println(triangle.getNumSides());

    }
}
