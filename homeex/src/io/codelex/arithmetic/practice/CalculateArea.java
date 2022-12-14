package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

public class CalculateArea {
    public static void main(String[] args) {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }

        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateCircleArea() {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the circle's radius? ");
        BigDecimal radius = keyboard.nextBigDecimal();

        if (radius.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Error: You entered negative value");
        } else {
            System.out.println("The rectangle's area is " + Geometry.areaOfCircle(radius));
        }
    }

    public static void calculateRectangleArea() {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter length: ");
        BigDecimal length = keyboard.nextBigDecimal();
        System.out.print("Enter width: ");
        BigDecimal width = keyboard.nextBigDecimal();

        if (width.compareTo(BigDecimal.ZERO) < 0 || length.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Error: You entered negative value");
        } else {
            System.out.println("The rectangle's area is " + Geometry.areaOfRectangle(length, width));
        }
    }

    public static void calculateTriangleArea() {


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Triangle's base: ");
        BigDecimal base = keyboard.nextBigDecimal();
        System.out.print("Triangle's height: ");
        BigDecimal height = keyboard.nextBigDecimal();


        if (base.compareTo(BigDecimal.ZERO) < 0 || height.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Error: You entered negative value");
        } else {
            System.out.println("The rectangle's area is " + Geometry.areaOfTriangle(base, height));
        }


    }
}
