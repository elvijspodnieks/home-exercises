package io.codelex.classesandobjects.practice.Ex2;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {
        Car car = createCar();

        Scanner scan = new Scanner(System.in);
        System.out.print("Fill up, enter milage: ");
        double milage = scan.nextDouble();
        System.out.print("Fill up, enter liters: ");
        double liters = scan.nextDouble();

        car.fillUp(milage, liters);

//        System.out.println(car.gasHog());
//        System.out.println(car.economyCar());

        System.out.println("Kilometers per liter are " + car.calculateConsumption());


    }

    private static Car createCar() {
        double startKilometers;
        double endKilometers;
        double liters;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

//        System.out.print("Enter second reading: ");
//        endKilometers = scan.nextDouble();
//
//        System.out.print("Enter liters consumed: ");
//        liters = scan.nextDouble();

        return new Car(startKilometers);
    }
}
