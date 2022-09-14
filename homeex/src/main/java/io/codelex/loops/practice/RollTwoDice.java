package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RollTwoDice {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int sum = sc.nextInt();
        Random random = new Random();
        int diceSum = 0;
        if (sum < 13) {
            while (diceSum != sum) {
                int dice1 = random.nextInt(6) + 1;
                int dice2 = random.nextInt(6) + 1;
                diceSum = dice1 + dice2;
                TimeUnit.MILLISECONDS.sleep(400);
                System.out.println(dice1 + " and " + dice2 + " = " + diceSum);
            }
        } else {
            System.out.println("Sum is not correct");
        }

    }
}
