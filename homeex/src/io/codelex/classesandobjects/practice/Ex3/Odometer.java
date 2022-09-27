package io.codelex.classesandobjects.practice.Ex3;

public class Odometer {
    private int milage;

    public Odometer(int milage) {
        this.milage = milage;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }


    public void addKilometers(double kilometers) {
        this.milage += kilometers;
        if (this.milage > 999999) {
            this.milage = 0;
        }
    }

    public void removeKilometers(double kilometers) {
        this.milage -= kilometers;
    }
}
