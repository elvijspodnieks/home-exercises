package main.java.io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    void makeSound() {
        System.out.println("Murrrrrrrrr");
    }

    @Override
    void eat(Food food) {
        foodEaten += food.quantity;
    }

    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + breed + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
