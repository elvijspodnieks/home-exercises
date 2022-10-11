package main.java.io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {

    protected String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }
}
