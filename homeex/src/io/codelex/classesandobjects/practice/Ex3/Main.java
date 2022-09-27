package io.codelex.classesandobjects.practice.Ex3;

public class Main {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(23);
        Odometer odometer = new Odometer(2400);
        System.out.println(fuelGauge.getFuel());


        while (fuelGauge.getFuel() < 70) {
            fuelGauge.addFuel();
            System.out.println(fuelGauge.getFuel());
        }
        System.out.println("Tank is full!");

        int startMilage = odometer.getMilage();

        while (fuelGauge.getFuel() > 0) {
            odometer.addKilometers(1);
            if (odometer.getMilage() % 10 == 0) {
                fuelGauge.burnFuel();
            }
        }
        System.out.println();
        System.out.println("Fuel is empty, kilometers: " + odometer.getMilage());
        System.out.println("You drove " + (odometer.getMilage() - startMilage) + " kilometers");
    }
}
