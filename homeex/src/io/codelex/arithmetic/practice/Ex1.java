package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a string: ");
        int num2 = sc.nextInt();


        if ((num1 == 15 || num2 == 15) || ((num1 + num2) == 15 || Math.abs(num1 - num2) == 15)) {
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
