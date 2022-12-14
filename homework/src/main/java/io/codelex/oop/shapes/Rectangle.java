package io.codelex.oop.shapes;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
