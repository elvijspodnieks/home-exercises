package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long min = input.nextLong();

        long years = (min / 525600);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println(years + " years and " + days + " days.");
    }
}
