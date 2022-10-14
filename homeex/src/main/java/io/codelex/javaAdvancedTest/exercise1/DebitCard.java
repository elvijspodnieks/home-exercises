package io.codelex.javaAdvancedTest.exercise1;

public class DebitCard extends Card {

    public DebitCard(String number, String ownerFullName, String ccv, int balance) {
        super(number, ownerFullName, ccv, balance);
    }

    @Override
    public void addMoney(int money) {
        this.balance += money;
        if (this.balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(int money) {
        if (this.balance < money){
            System.out.println("NotEnoughFundsException");
        } else {
            this.balance -= money;
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "number=" + number +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", ccv='" + ccv + '\'' +
                ", balance=" + balance +
                '}';
    }
}
