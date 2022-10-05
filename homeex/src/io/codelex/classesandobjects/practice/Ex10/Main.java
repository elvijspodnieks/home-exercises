package io.codelex.classesandobjects.practice.Ex10;

public class Main {
    public static void main(String[] args) {

        BankAccount benben = new BankAccount("Benson", 25.50);

        benben.deposit(2);
        benben.withdraw(5.50);

        System.out.println(benben.toString());

    }
}
