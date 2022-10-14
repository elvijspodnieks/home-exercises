package io.codelex.javaAdvancedTest.exercise1;

public class CreditCard extends Card     {

    public CreditCard(String number, String ownerFullName, String ccv, int balance) {
        super(number, ownerFullName, ccv, balance);
    }

    @Override
    public void addMoney(int money) {
        this.balance += money;
    }

    @Override
    public void takeMoney(int money){
        if (this.balance < money){
            System.out.println("NotEnoughFundsException");
        } else {
            balance -= money;
        }
        if (balance < 100) {
            System.out.println("Warning: Low funds");
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", ccv='" + ccv + '\'' +
                ", balance=" + balance +
                '}';
    }
}
