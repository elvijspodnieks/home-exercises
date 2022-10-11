package main.java.io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {


    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("iiiiiiiiiiii");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
        } else {
            System.out.println(this.getClass().getSimpleName() + " will not eat this type of food");
        }
    }

    @Override
    public String toString() {
        return animalType.toUpperCase() + "[" + animalName + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }

}
