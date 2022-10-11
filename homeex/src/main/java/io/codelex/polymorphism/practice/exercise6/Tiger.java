package main.java.io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.livingRegion = livingRegion;
    }


    @Override
    void makeSound() {
        System.out.println("Wrawr wrawr");
    }

    @Override
    void eat(Food food) {
        foodEaten += food.quantity;
    }

    public String toString() {
        return animalType + "[" + animalName + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
