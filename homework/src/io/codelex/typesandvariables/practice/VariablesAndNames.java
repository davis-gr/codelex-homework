package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {

        int cars = 100;
        int seatsInACar = 4;
        int passengers = 90;
        int carsDriven = 30;
        int carsNotDriven = cars - carsDriven;
        int carpoolCapacity = carsDriven * seatsInACar;
        double averagePassengersPerCar = (double) passengers / carsDriven;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + carsDriven + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}