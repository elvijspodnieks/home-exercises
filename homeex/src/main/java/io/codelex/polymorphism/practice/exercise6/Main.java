package main.java.io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        label:
        while (true) {

            System.out.println("Please enter the details for Your animal in format -->");
            System.out.println("AnimalType AnimalName AnimalWeight AnimalLivingRegion CatBreed          Catbreed only if its cat");

            Animal animal = null;
            Scanner sc = new Scanner(System.in);
            String inputData = sc.nextLine();
            String[] inputDataArr = inputData.split(" ");

            switch (inputDataArr[0].toLowerCase()) {
                case "end":
                    break label;
                case "cat":
                    animal = new Cat(inputDataArr[0], inputDataArr[1], Double.parseDouble(inputDataArr[2]), inputDataArr[3], inputDataArr[4]);
                    break;
                case "tiger":
                    animal = new Tiger(inputDataArr[0], inputDataArr[1], Double.parseDouble(inputDataArr[2]), inputDataArr[3]);
                    break;
                case "zebra":
                    animal = new Zebra(inputDataArr[0], inputDataArr[1], Double.parseDouble(inputDataArr[2]), inputDataArr[3]);
                    break;
                case "mouse":
                    animal = new Mouse(inputDataArr[0], inputDataArr[1], Double.parseDouble(inputDataArr[2]), inputDataArr[3]);
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
            Food food = null;
            animals.add(animal);
            animal.makeSound();

            System.out.println("Please enter the details for Your animal food -->");
            System.out.println("Food Quantity          ");
            String foodData = sc.nextLine();
            String[] inputFoodData = foodData.split(" ");
            if (inputFoodData[0].toLowerCase().equals("meat")) {
                food = new Meat(Integer.parseInt(inputFoodData[1]));
            } else if (inputFoodData[0].toLowerCase().equals("vegetable")) {
                food = new Vegetable(Integer.parseInt(inputFoodData[1]));
            } else {
                System.out.println("Invalid input!");
            }
            animal.eat(food);
            System.out.println(animals);

        }
    }
}
