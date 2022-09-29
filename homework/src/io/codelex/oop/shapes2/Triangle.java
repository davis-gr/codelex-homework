package io.codelex.oop.shapes2;

public class Triangle extends Shape {

    // I will deal only with regular triangles
    private double sideLength;

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
    }


    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3) / 4 * Math.pow(sideLength, 2);
    }
}
