package io.codelex.javaAdvancedTest.exercise1;

public class DebitCard extends Card {

    public DebitCard(String number, String ownerFullName, String ccv, double balance) {
        super(number, ownerFullName, ccv, balance);
    }

    @Override
    public void addMoney(double money) {
        this.balance += money;
        if (this.balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }


    @Override
    public String toString() {
        return "DebitCard{" +
                "number=" + getNumber() +
                ", ownerFullName='" + getOwnerFullName() + '\'' +
                ", ccv='" + getCcv() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }
}
