package io.codelex.oop.summary.shape9;

public class Qube extends S3DShape {

    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculatePerimeter() {
        return side * 12;
    }

    @Override
    public double calculateArea() {
        return side * side * 6;
    }
}
