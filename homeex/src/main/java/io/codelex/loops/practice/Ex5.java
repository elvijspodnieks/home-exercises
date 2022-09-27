package io.codelex.loops.practice;

import java.util.Scanner;

public class Ex5 {
    final static int maxDots = 30;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = input.next();
        System.out.println("Enter second word: ");
        String word2 = input.next();

        String dots = "";
        int count = maxDots - word1.length() - word2.length();

        for (int i = 1; i <= count; i++) {
            dots += ".";
        }
        System.out.println(word1 + dots + word2);
    }
}

