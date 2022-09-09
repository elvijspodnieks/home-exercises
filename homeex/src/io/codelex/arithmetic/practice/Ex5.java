package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int random = (int)(Math.random()*100);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > random) {
            System.out.println("Sorry, you are too high.  I was thinking of " + random);
        } else if (number < random) {
            System.out.println("Sorry, you are too low.  I was thinking of " + random);
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
