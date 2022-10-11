package main.java.io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commisionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + totalSales * commisionRate;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal sales: " + totalSales;
    }

    ///one is the total sales the employee has made (type double) and the second is the commission rate for the employee
    // (the commission rate will be type double and will represent the percent (in decimal form)
    //commission the employee earns on sales (so .2 would mean the employee earns 20% commission on sales)).
}
