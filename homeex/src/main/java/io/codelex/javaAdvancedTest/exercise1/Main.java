package io.codelex.javaAdvancedTest.exercise1;

public class Main {
    public static void main(String[] args) {

        CreditCard myCreditCard = new CreditCard("371812343423", "Peter Smith", "003", 100);
        myCreditCard.takeMoney(20);
        myCreditCard.addMoney(30000);
        System.out.println(myCreditCard);

        DebitCard myDebitCard = new DebitCard("2183242373128", "John Wick", "023", 124333);
        myDebitCard.takeMoney(13000);
        myDebitCard.addMoney(1000);
        System.out.println(myDebitCard);
    }
}
