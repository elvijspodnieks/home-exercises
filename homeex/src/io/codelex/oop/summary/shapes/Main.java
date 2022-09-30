package io.codelex.oop.summary.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3, 4);
        Triangle triangle = new Triangle(2, 3, 4);

        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getNumSides());

        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getNumSides());
    }
}
