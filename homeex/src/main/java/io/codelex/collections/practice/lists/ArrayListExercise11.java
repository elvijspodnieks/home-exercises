package main.java.io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> cars = new ArrayList<>();

        //TODO: Add 10 values to list
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Cupra");
        cars.add("Skoda");
        cars.add("Opel");
        cars.add("VW");
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("Nissan");

        //TODO: Add new value at 5th position

        cars.add(4, "Scania");

        //TODO: Change value at last position (Calculate last position programmatically)

        cars.set(cars.size() - 1, "LastCar");

        //TODO: Sort your list in alphabetical order

        Collections.sort(cars);

        //TODO: Check if your list contains "Foobar" element

        if (cars.contains("Foobar")) {
            System.out.println("Contains");
        } else {
            System.out.println("Dosnt contains");
        }

        //TODO: Print each element of list using loop

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

}