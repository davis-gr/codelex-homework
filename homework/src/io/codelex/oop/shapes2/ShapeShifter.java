package io.codelex.oop.shapes2;

public class ShapeShifter {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 7);
        Triangle triangle = new Triangle(12);
        Hexagon hexagon = new Hexagon(6);
        Cone iceCreamCone = new Cone(6, 5);
        Cube cube = new Cube(5);

        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());

        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Hexagon area: " + hexagon.calculateArea());

        System.out.println("Ice cream base (top?) perimeter: " + iceCreamCone.calculatePerimeter());
        System.out.println("Ice cream area: " + iceCreamCone.calculateArea());
        System.out.println("Ice cream volume: " + iceCreamCone.calculateVolume());

        System.out.println("Cube perimeter: " + cube.calculatePerimeter());
        System.out.println("Cube area: " + cube.calculateArea());
        System.out.println("Cube volume: " + cube.calculateVolume());

    }
}
