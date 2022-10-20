package io.codelex.oop.summary.shape9;

public class Triangle extends Shape {

    private double length;
    private double heigth;

    public Triangle(double length, double heigth) {
        this.length = length;
        this.heigth = heigth;
    }

    @Override
    public double calculatePerimeter() {
        return length * 3;
    }

    @Override
    public double calculateArea() {
        return (length * heigth) / 2;
    }
}
