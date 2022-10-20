package io.codelex.oop.summary.shape9;

public class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 6;
    }

    @Override
    public double calculateArea() {
        return 3 * Math.sqrt(3) * Math.pow(side, 2) / 2;
    }
}
