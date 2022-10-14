package io.codelex.javaAdvancedTest.exercise1;

public abstract class Card extends Exception {
     String number;
     String ownerFullName;
     String ccv;
    int balance;

    public abstract void addMoney(int money);

    public abstract void takeMoney(int money);
    public Card(String number, String ownerFullName, String ccv, int balance) {
        this.number = number;
        this.ownerFullName = ownerFullName;
        this.ccv = ccv;
        this.balance = balance;
    }






}
