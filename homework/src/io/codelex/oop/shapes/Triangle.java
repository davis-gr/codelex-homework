package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private double width;
    private double height;

    public Triangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        return height*2 + width;
    }
}
