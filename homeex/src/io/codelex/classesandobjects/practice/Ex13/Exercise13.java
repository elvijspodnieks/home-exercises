package io.codelex.classesandobjects.practice.Ex13;

public class Exercise13 {
    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);

        transfer(A, B, 50);
        transfer(B, C, 25);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}