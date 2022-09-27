package io.codelex.classesandobjects.practice.Ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How much money is in the account? ");
        SavingsAccount account = new SavingsAccount(input.nextDouble());
        System.out.print("Enter the annual interest rate: ");
        account.setInterestRate(input.nextDouble());
        System.out.print("How long has the account been opened? ");
        int months = input.nextInt();

        double sumOfDeposit = 0;
        double sumOfWithdraw = 0;
        double totalInterest = 0;
        double deposit = 0;
        double withdraw = 0;

        for (int i = 1; i <= months; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter amount deposited for month: " + i + ": ");
            deposit = scan.nextDouble();
            account.deposit(deposit);
            sumOfDeposit = sumOfDeposit + deposit;
            System.out.print("Enter amount withdrawn for month: " + i + ": ");
            withdraw = scan.nextDouble();
            account.withdraw(withdraw);
            sumOfWithdraw = sumOfWithdraw + withdraw;
            totalInterest = totalInterest + account.compound();
        }
        System.out.printf("Total deposited: $" + "%,.2f \n", sumOfDeposit);
        System.out.printf("Total withdrawn: $" + "%,.2f \n", sumOfWithdraw);
        System.out.printf("Interest earned: $" + "%,.2f \n", totalInterest);
        System.out.printf("Ending balance: $" + "%,.2f \n", account.getBalance());
    }

}
