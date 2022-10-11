package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();


        if (input == 0) {
            System.out.println("Sunday");
        } else if (input == 1) {
            System.out.println("Monday");
        } else if (input == 2) {
            System.out.println("Tuesday");
        } else if (input == 3) {
            System.out.println("Wednesday");
        } else if (input == 4) {
            System.out.println("Thursday");
        } else if (input == 5) {
            System.out.println("Friday");
        } else if (input == 6) {
            System.out.println("Saturday");
        }

        switch (input) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                break;
        }
    }
}
