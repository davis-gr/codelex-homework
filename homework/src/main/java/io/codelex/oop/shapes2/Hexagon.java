package io.codelex.oop.shapes2;

public class Hexagon extends Shape {

    private double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 6;
    }

    @Override
    double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;
    }
}
