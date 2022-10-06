package main.java.io.codelex.excep;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the numerator");
            String numerator = scanner.nextLine();
            int number1 = 1;
            int number2 = 1;
            if (numerator.startsWith("q") || numerator.startsWith("Q")) {
                break;
            }
            try {
                number1 = Integer.parseInt(numerator);
                System.out.println("Enter the divisor");
                String divisor = scanner.nextLine();
                number2 = Integer.parseInt(divisor);
                try {
                    System.out.println(numerator + " / " + number2 + " = " + number1 / number2);
                } catch (ArithmeticException e) {
                    // Exception handler
                    System.out.println(
                            "Divided by zero operation cannot possible");
                }
            } catch (NumberFormatException ex) {
                System.out.println("You entered bad data.");
            }
        }
    }
}
