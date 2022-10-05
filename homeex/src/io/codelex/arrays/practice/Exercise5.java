package io.codelex.arrays.practice;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int element1 = 36;
        int element2 = 29;

        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8

        System.out.println("Index position of " + element1 + " is: " + findIndex(myArray, element1));
        System.out.println("Index position of " + element2 + " is: " + findIndex(myArray, element2));
    }

    public static int findIndex(int[] array, int element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }
        return index;
    }
}
