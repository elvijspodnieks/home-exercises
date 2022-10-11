package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to convert:");
        String userInput = input.nextLine().toUpperCase();
        for (int i = 0; i < userInput.length(); i++) {
            char current = userInput.charAt(i);
            switch (current) {
                case 'A', 'B', 'C' -> System.out.print(2);
                case 'D', 'E', 'F' -> System.out.print(3);
                case 'G', 'H', 'I' -> System.out.print(4);
                case 'J', 'K', 'L' -> System.out.print(5);
                case 'M', 'N', 'O' -> System.out.print(6);
                case 'P', 'Q', 'R', 'S' -> System.out.print(7);
                case 'T', 'U', 'V' -> System.out.print(8);
                case 'W', 'X', 'Y', 'Z' -> System.out.print(9);
            }
        }
        System.out.println("\n----------------------");

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'A' || userInput.charAt(i) == 'B' || userInput.charAt(i) == 'C') {
                System.out.print(2);
            } else if (userInput.charAt(i) == 'D' || userInput.charAt(i) == 'E' || userInput.charAt(i) == 'F') {
                System.out.print(3);
            } else if (userInput.charAt(i) == 'G' || userInput.charAt(i) == 'H' || userInput.charAt(i) == 'I') {
                System.out.print(4);
            } else if (userInput.charAt(i) == 'J' || userInput.charAt(i) == 'K' || userInput.charAt(i) == 'L') {
                System.out.print(5);
            } else if (userInput.charAt(i) == 'M' || userInput.charAt(i) == 'N' || userInput.charAt(i) == 'O') {
                System.out.print(6);
            } else if (userInput.charAt(i) == 'P' || userInput.charAt(i) == 'Q' || userInput.charAt(i) == 'R' || userInput.charAt(i) == 'S') {
                System.out.print(7);
            } else if (userInput.charAt(i) == 'T' || userInput.charAt(i) == 'U' || userInput.charAt(i) == 'V') {
                System.out.print(8);
            } else {
                System.out.print(9);
            }
        }

    }


}
