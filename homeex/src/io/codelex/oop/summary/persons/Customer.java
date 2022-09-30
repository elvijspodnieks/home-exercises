package io.codelex.oop.summary.persons;

public class Customer extends Person {


    private String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getCustomerId() + " Purchases: " + getPurchaseCount();
    }

}
