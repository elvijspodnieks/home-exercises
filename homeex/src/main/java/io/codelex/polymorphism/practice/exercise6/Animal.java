package main.java.io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected double animalWeight;
    Integer foodEaten = 0;

    public Animal(String animalType, String animalName, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    abstract void makeSound();

    abstract void eat(Food name);

}
