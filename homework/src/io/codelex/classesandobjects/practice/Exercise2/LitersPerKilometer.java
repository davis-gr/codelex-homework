package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {

        Car car = createCar();

        Scanner scan = new Scanner(System.in);
        System.out.println(("Fill up, enter mileage: "));
        double mileage = scan.nextDouble();
        System.out.println(("Fill up, enter liters: "));
        double liters = scan.nextDouble();

        car.fillUp(mileage, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());
    }

    private static Car createCar() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading: ");
        double startKilometers = scan.nextDouble();

        return new Car(startKilometers);
    }
}