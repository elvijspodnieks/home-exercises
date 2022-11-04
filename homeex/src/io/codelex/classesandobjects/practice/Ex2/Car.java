
package io.codelex.classesandobjects.practice.Ex2;

public class Car {

    private final double gasHogCarConsumption = 15;
    private final double economyCarConsumption = 5;

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
        return calculateConsumption() > gasHogCarConsumption;
    }

    public boolean economyCar() {
        return calculateConsumption() < economyCarConsumption;
    }

    public void fillUp(double milage, double liters) {
        endKilometers = milage;
        this.liters = liters;
    }

}
