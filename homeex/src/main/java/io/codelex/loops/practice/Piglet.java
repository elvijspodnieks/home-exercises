package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;


public class Piglet {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random roller = new Random();

        String input;
        int result = 0;
        int rollNumber;

        System.out.println("Welcome to Piglet!");

        do {
            rollNumber = roller.nextInt(1, 7);

            if (rollNumber == 1) {
                result = 0;
                System.out.println("You rolled a 1 and your final score is " + result);
                break;
            }
            result = result + rollNumber;
            System.out.println("You rolled a " + rollNumber + " \nRoll again? yes/no");
            input = userInput.next();

        } while (input.equals("yes"));

        System.out.println("Your get " + result + " points.");

    }
}
