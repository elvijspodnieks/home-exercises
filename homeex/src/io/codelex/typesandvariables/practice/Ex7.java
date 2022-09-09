package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String name = input.nextLine();

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i)))
                count++;
        }

        System.out.println("Number of the uppercase letters: " + count);
    }
}
