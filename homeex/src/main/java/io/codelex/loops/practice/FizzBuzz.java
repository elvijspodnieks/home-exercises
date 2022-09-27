package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.print("Max value? : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz");
            } else {
                System.out.print(" " + i);
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
