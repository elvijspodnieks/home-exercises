package io.codelex.oop.summary.shape9;

public class Rectangle extends Shape {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return (length + height) * 2;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }
}
