package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n * 4) - 4 * i; j++) {
                System.out.print("/");
            }

            for (int j = 1; j <= 8 * i - 8; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (n * 4) - 4 * i; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}
