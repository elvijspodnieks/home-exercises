package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        System.out.print("Min: ");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        System.out.print("Min: ");
        in = new Scanner(System.in);
        int max = in.nextInt();

        for (int i = min; i <= max; i++) {

            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }

            for (int j = min; j < i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
