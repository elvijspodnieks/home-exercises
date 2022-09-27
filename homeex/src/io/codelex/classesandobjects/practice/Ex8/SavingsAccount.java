package io.codelex.classesandobjects.practice.Ex8;

public class SavingsAccount {
    private double interestRate;
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    double compound() {
        double earnedThisMonth = this.balance * interestRate / 100 / 12;
        deposit(earnedThisMonth);
        return earnedThisMonth;
    }
}
