package io.codelex.classesandobjects.practice.Exercise2;

public class Car {

    private double startKilometers;
    private double endKilometers;
    private double liters;

    private final int HUNGRY_BENCHMARK = 15;
    private final int ECONOMY_BENCHMARK = 5;


    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }

    public double calculateConsumption() {
        return liters * 100 / (endKilometers - startKilometers);
    }

    public boolean gasHog() {
        return calculateConsumption() > HUNGRY_BENCHMARK;
    }

    public boolean economyCar() {
        return calculateConsumption() < ECONOMY_BENCHMARK;
    }

    public void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
