package main.java.io.codelex.polymorphism.practice.exercise1;

public class Jaguar implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Wrumm wrupp.....");
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
