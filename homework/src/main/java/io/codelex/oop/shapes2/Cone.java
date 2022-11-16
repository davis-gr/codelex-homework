package io.codelex.oop.shapes2;

public class Cone extends ThreeDimensionalShape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculateVolume() {
        return ((double) 1 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }
}
