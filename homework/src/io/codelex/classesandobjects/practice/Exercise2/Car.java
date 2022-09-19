package io.codelex.classesandobjects.practice.Exercise2;

public class Car {

    private double startKilometers;
    private double endKilometers;
    private double liters;


    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }

    public double calculateConsumption() {
        return liters * 100 / (endKilometers - startKilometers);
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }

    public void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
