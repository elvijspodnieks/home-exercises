package io.codelex.arithmetic.practice;

public class GravityCalculator {
    public static void main(String[] arguments) {
        double acceleration = -9.81;
        double initialVelocity = 0.0;
        double time = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.5 * acceleration * (Math.pow(time, 2)) + (initialPosition * time) + initialVelocity;
        System.out.println(finalPosition + "m.");
    }
}
