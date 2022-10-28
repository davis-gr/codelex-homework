package io.codelex.classesandobjects.practice.Exercise3;

public class Main {
    public static void main(String[] args) {

        FuelGauge gauge = new FuelGauge(27);
        System.out.println("Starting off with " + gauge.getFuel() + " liters in the tank.");
        Odometer odo = new Odometer(42069);

        System.out.println(gauge.setFuel(42));
        System.out.println("We now have " + gauge.getFuel() + " liters in the tank.");

        driveCar(gauge, odo);

    }

    private static void driveCar(FuelGauge gauge, Odometer odo) {
        while (gauge.getFuel() > 0) {
            System.out.println("Current odometer: " + odo.getMileage() + ". Remaining fuel: " + gauge.getFuel() + ".");
            odo.setMileage(10, gauge);
        }
        System.out.println("You have run out of fuel at " + odo.getMileage() + " kilometers. Happy camping!");
    }
}
