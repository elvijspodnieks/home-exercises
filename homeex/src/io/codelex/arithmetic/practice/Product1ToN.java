package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int result = 1;
        int num = 10;
        for (int i = 1; i < num; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
