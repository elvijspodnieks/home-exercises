package main.java.io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Bmw bmw = new Bmw();
        Audi audi = new Audi();
        Cupra cupra = new Cupra();
        Tesla tesla = new Tesla();
        Lexus lexus = new Lexus();
        Jaguar jaguar = new Jaguar();
        cars.add(bmw);
        cars.add(audi);
        cars.add(cupra);
        cars.add(lexus);
        cars.add(jaguar);
        cars.add(tesla);

        System.out.println(cars.toString());

        for (int i = 0; i < 10; i++) {
            for (Car car : cars) {
                car.speedUp();
                if (i == 2) {
                    if (car instanceof FastCar) {
                        ((FastCar) car).useNitrousOxideEngine();
                    }
                }
            }
        }
        Car maxValue = cars.stream().max(Comparator.comparing(v -> Integer.parseInt(v.showCurrentSpeed()))).get();
        System.out.println("Fastest car: " + maxValue.getClass().getSimpleName() + "  Max speed: " + maxValue.showCurrentSpeed());
        System.out.println(cars.toString());
    }
}
