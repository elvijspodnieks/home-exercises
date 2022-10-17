package io.codelex.javaAdvancedTest.exercise1;

public abstract class Card extends Exception {
    private String number;
    private String ownerFullName;
    private String ccv;
    double balance;



    public Card(String number, String ownerFullName, String ccv, double balance) {
        this.number = number;
        this.ownerFullName = ownerFullName;
        this.ccv = ccv;
        this.balance = balance;
    }
    public void addMoney(double money){
        balance += money;
    }

    public void takeMoney(double money){
        if(money > balance){
            throw new NotEnoughFundsException("Not enough funds");
        } else {
            balance -= money;
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
