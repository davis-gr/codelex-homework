package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    private static final int NUMBERED_SURVEYED = 12467;
    private static final double PURCHASED_ENERGY_DRINKS = 0.14;
    private static final double PREFER_CITRUS_DRINKS = 0.64;


    public static void main(String[] args) {
        //fixme
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + (int) calculateEnergyDrinkers() + " bought at least one energy drink");
        System.out.println((int) calculatePreferCitrus() + " of those " + "prefer citrus flavored energy drinks.");
    }

    private static double calculateEnergyDrinkers() {
        return Math.round(PURCHASED_ENERGY_DRINKS * NUMBERED_SURVEYED);
    }

    private static double calculatePreferCitrus() {
        return Math.round(PREFER_CITRUS_DRINKS * PURCHASED_ENERGY_DRINKS * NUMBERED_SURVEYED);
    }
}
