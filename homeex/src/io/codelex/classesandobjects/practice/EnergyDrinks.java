package io.codelex.classesandobjects.practice;

//import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    private static final int NUMBERED_SURVEYED = 12467;
    private static double PURCHASED_ENERGY_DRINKS = 0.14;
    private static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + (int) calculateEnergyDrinkers(NUMBERED_SURVEYED) + " bought at least one energy drink");
        System.out.println((int) calculatePreferCitris(NUMBERED_SURVEYED) + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return Math.round(PURCHASED_ENERGY_DRINKS * NUMBERED_SURVEYED);
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        return Math.round(PREFER_CITRUS_DRINKS * PURCHASED_ENERGY_DRINKS * NUMBERED_SURVEYED);
    }
}
