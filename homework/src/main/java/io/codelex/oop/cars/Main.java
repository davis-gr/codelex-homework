package io.codelex.oop.cars;

public class Main {
    public static void main(String[] args) {

        Manufacturer astonMartin = new Manufacturer("Aston Martin", 1913, "United Kingdom");
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer ferrari = new Manufacturer("Ferrari", 1939, "Italy");
        Manufacturer ford = new Manufacturer("Ford", 1903, "USA");
        Manufacturer dodge = new Manufacturer("Dodge", 1900, "USA");

        Car dbs = new Car("Aston Martin", "DBS", 150000, 2012, EngineType.V12, astonMartin);
        Car m4 = new Car("BMW", "M4", 120000, 2022, EngineType.S6, bmw);
        Car gc420d = new Car("BMW", "420d", 20000, 2015, EngineType.S4, bmw);
        Car m760Li = new Car("BMW", "M760Li", 63000, 2017, EngineType.V12, bmw);
        Car f812 = new Car("Ferrari", "812", 350000, 2019, EngineType.V12, ferrari);
        Car mustang = new Car("Ford", "Mustang", 50000, 2020, EngineType.V8, ford);
        Car challenger = new Car("Dodge", "Challenger", 65000, 2019, EngineType.V8, dodge);
        Car oldMustang = new Car("Ford", "Mustang", 70000, 1969, EngineType.V8, ford);
        Car trash = new Car("Ford", "Focus", 500, 1998, EngineType.S4, ford);
        Car frankenstein = new Car("Aston Ferrari", "Charger M550i", 777777, 2020, EngineType.V6, astonMartin, ferrari, dodge, bmw);

        CarService carservice = new CarService();
        carservice.addToList(dbs);
        carservice.addToList(m4);
        carservice.addToList(gc420d);
        carservice.addToList(m760Li);
        carservice.addToList(f812);
        carservice.addToList(mustang);
        carservice.addToList(challenger);
        carservice.addToList(oldMustang);
        carservice.addToList(trash);
        carservice.addToList(frankenstein);

        carservice.removeFromList(challenger);

        System.out.println("All cars list: " + carservice.getCarList());
        System.out.println("V12 engined cars: " + carservice.getAmazingCars());
        System.out.println("Cars produced before 1999: " + carservice.getOldCars());
        System.out.println("Most expensive car: " + carservice.getPriceyCar());
        System.out.println("Cheapest car: " + carservice.getCheapCar());
        System.out.println("Cars with at least three manufacturers: " + carservice.multipleManufacturers());
        //I decided to implement one sorting mechanism as a proof of concept - by car's age.
        System.out.println("Sorted by age (ascending): " + carservice.sortByAge("ascending"));
        System.out.println("Sorted by age (descending): " + carservice.sortByAge("descending"));
        System.out.println("Check if car exists - " + challenger + ": " + carservice.checkIfCarExists(challenger));
        System.out.println("Check if car exists - " + mustang + ": " + carservice.checkIfCarExists(mustang));
        System.out.println("Get manufacturer's cars for " + bmw + ": " + carservice.getManufacturerCars(bmw));
        System.out.println("Get list of cars manufactured by manufacturer with specific year of establishment: " + carservice.filterByManufacturerYears("<", 1915));
        System.out.println("Get list of cars manufactured by manufacturer with specific year of establishment: " + carservice.filterByManufacturerYears(">=", 1939));
        System.out.println("Get list of cars manufactured by manufacturer with specific year of establishment: " + carservice.filterByManufacturerYears("=", 1916));


    }

}
