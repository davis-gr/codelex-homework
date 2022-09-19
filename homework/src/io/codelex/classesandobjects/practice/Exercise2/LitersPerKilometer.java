package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {

        Car car = getCarData();

        Scanner scan = new Scanner(System.in);
        System.out.println(("Fill up, enter mileage: "));
        double mileage = scan.nextDouble();
        System.out.println(("Fill up, enter liters: "));
        double liters = scan.nextDouble();

        car.fillUp(mileage, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());
    }

    private static Car getCarData() {
        Scanner scan = new Scanner(System.in);

        double startKilometers;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        return new Car(startKilometers);
    }
}