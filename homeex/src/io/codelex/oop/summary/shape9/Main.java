package io.codelex.oop.summary.shape9;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(6, 5);
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());

        Hexagon hexagon = new Hexagon(3);
        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Hexagon area: " + hexagon.calculateArea());

        Cone cone = new Cone(5, 3);
        System.out.println("Cone volume: " + cone.calculateVolume());
        System.out.println("Cone perimeter: " + cone.calculatePerimeter());

        Qube qube = new Qube(4);
        System.out.println("Qube area: " + qube.calculateArea());
        System.out.println("Qube volume: " + qube.calculateVolume());
        System.out.println("Qube perimeter: " + qube.calculatePerimeter());
    }
}
