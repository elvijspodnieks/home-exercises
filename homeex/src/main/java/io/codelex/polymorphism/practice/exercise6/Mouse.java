package main.java.io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Piipiipii");
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
        return animalType + "[" + animalName + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
