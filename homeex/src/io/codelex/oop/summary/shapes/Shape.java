package io.codelex.oop.summary.shapes;

public abstract class Shape {

    private int numSides;

    public int getNumSides() {
        return numSides;
    }

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
