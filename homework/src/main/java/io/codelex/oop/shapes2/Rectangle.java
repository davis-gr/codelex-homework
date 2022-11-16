package io.codelex.oop.shapes2;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    double calculatePerimeter() {
        return (length + width) * 2;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
