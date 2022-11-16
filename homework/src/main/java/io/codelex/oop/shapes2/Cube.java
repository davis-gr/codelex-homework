package io.codelex.oop.shapes2;

public class Cube extends ThreeDimensionalShape {

    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 12 * sideLength;
    }

    @Override
    double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
