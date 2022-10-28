package io.codelex.classesandobjects.practice.Exercise3;

public class FuelGauge {

    private int fuel;
    private final int TANK_SIZE = 70;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public String setFuel(int fuel) {
        if (this.fuel + fuel > TANK_SIZE) {
            this.fuel = TANK_SIZE;
            return "Refilled the tank to it's max capacity - 70L.";
        } else {
            this.fuel += fuel;
            return "Added " + fuel + " liters to the tank.";
        }
    }


}
