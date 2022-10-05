package io.codelex.classesandobjects.practice;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {
        Car car = getCarData();

        System.out.println("Kilometers per liter are " + car.calculateConsumption());


    }

    private static Car getCarData() {
        double startKilometers;
        double endKilometers;
        double liters;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        return new Car(startKilometers);

    }

}
