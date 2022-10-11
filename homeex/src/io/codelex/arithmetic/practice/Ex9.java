package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        System.out.println("Enter your weight in pounds");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("Enter your height in inches");
        int height = sc.nextInt();

        double bmi = weight / Math.pow(height, 2) * 703;

        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi > 25) {
            System.out.println("overweight");
        } else {
            System.out.println("optimal");
        }
    }
}
