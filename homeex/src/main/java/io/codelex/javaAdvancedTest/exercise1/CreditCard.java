package io.codelex.javaAdvancedTest.exercise1;

public class CreditCard extends Card     {

    public CreditCard(String number, String ownerFullName, String ccv, int balance) {
        super(number, ownerFullName, ccv, balance);
    }

    @Override
    public void takeMoney(double money){
        if (this.balance < money){
            throw new NotEnoughFundsException("Not enough funds");
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
                "number=" + getNumber() +
                ", ownerFullName='" + getOwnerFullName() + '\'' +
                ", ccv='" + getCcv() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }
}
