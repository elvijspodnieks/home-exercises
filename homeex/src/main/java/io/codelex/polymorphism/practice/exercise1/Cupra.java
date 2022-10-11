package main.java.io.codelex.polymorphism.practice.exercise1;

public class Cupra implements Car, FastCar {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed += 10;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 42;
    }

    @Override
    public void startEngine() {
        System.out.println("Ratatatata.....");
    }

    @Override
    public String toString() {
        return "Cupra{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
