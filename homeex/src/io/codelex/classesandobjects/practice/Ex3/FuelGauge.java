package io.codelex.classesandobjects.practice.Ex3;

public class FuelGauge {
    private double fuel;

    public FuelGauge(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void addFuel() {
        if (fuel < 70) {
            fuel += 1;
        }
    }

    public void burnFuel() {
        if (fuel >= 0) {
            this.fuel -= 1;
        }
    }
}
