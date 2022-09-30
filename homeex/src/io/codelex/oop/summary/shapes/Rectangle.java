package io.codelex.oop.summary.shapes;

import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int numSides, int width, int height) {
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
        return width * 2 + height * 2;
    }


}
