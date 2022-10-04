package io.codelex.classesandobjects.practice;

public class Car {
    private double startKilometers;
    private double endKilometers;

    private double liters;

    //    public Car(double startKilometers, double endKilometers, double liters) {
//        this.startKilometers = startKilometers;
//        this.endKilometers = endKilometers;
//        this.liters = liters;
//    }
    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }


    public double calculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }

    public void fillUp(double milage, double liters) {
        endKilometers = milage;
        this.liters = liters;
    }

}