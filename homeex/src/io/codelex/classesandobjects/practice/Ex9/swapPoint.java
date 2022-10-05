package io.codelex.classesandobjects.practice.Ex9;

import java.awt.*;

public class swapPoint {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoint(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    public static void swapPoint(Point p1, Point p2) {
        int x = p1.x;
        int y = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = x;
        p2.y = y;
    }


}
