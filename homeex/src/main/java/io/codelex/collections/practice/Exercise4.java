package main.java.io.codelex.collections.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> names = new HashSet<>();


        while (true) {
            System.out.print("Enter name: ");
            String inputText = sc.nextLine();
            if (inputText.equals("")) {
                System.out.println("Unique name list contains: " + Arrays
                        .toString(names.toArray())
                        .replaceAll("[\\[\\],]", "")
                );
                break;

            } else {
                names.add(inputText);
            }

        }
    }
}
