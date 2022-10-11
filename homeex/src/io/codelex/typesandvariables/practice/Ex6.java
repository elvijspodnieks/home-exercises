package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int num = 0;
        int last = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        while (num > 0) {
            last = num % 10;
            result = result + last;
            num = num / 10;
        }
        System.out.println("Sum of all the numbers: " + result);
    }
}
