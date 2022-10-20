package io.codelex.oop.summary.shape9;

import static java.lang.Math.PI;

public class Cone extends S3DShape {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return PI * Math.pow(radius, 2) * height / 3;
    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt(Math.pow(height, 2) * Math.pow(radius, 2)) * PI * radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
