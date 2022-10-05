package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] numArr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            numArr1[i] = (int) (Math.random() * 100);
        }
        int[] numArr2 = Arrays.copyOf(numArr1, numArr1.length);
        numArr2[9] = -7;

        StringBuilder printArr1 = new StringBuilder();
        StringBuilder printArr2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            printArr1.append(numArr1[i]).append(" ");
            printArr2.append(numArr2[i]).append(" ");
        }

        System.out.println("Array 1: " + printArr1.toString());
        System.out.println("Array 2: " + printArr2.toString());
    }

}
