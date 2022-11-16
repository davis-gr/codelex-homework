package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {

    private List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void addToList(Car car) {
        carList.add(car);
    }

    public void removeFromList(Car car) {
        carList.remove(car);
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carList=" + carList +
                '}';
    }

    public List<Car> getAmazingCars() {
        return carList.stream().filter(car -> car.getEngineType() == EngineType.V12).toList();
    }

    public List<Car> getOldCars() {
        return carList.stream().filter(car -> car.getYearOfManufacturing() < 1999).toList();
    }

    public Car getPriceyCar() {
        carList.sort(Comparator.comparing(Car::getPrice).reversed());
        return carList.get(0);
    }

    public Car getCheapCar() {
        carList.sort(Comparator.comparing(Car::getPrice));
        return carList.get(0);
    }

    public boolean checkIfCarExists(Car car) {
        if (carList.contains(car)) {
            return true;
        }
        return false;
    }

    public List<Car> getManufacturerCars(Manufacturer manufacturer) {
        return carList.stream().filter(car -> car.getManufacturer().contains(manufacturer)).toList();
    }

    public List<Car> sortByAge(String sortingParam) {
        if (sortingParam.equalsIgnoreCase("ascending")) {
            carList.sort(Comparator.comparing(Car::getYearOfManufacturing));
        } else {
            carList.sort(Comparator.comparing(Car::getYearOfManufacturing).reversed());
        }
        return carList;
    }

    public List<Car> multipleManufacturers() {
        return carList.stream().filter(car -> (long) car.getManufacturer().size() >= 3).toList();
    }


    public List<Car> filterByManufacturerYears(String parameter, int year) {
        switch (parameter) {
            case "<" -> {
                return carList.stream().filter(car -> car.getManufacturer().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() < year)).toList();
            }
            case "<=" -> {
                return carList.stream().filter(car -> car.getManufacturer().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() <= year)).toList();
            }
            case ">" -> {
                return carList.stream().filter(car -> car.getManufacturer().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year)).toList();
            }
            case ">=" -> {
                return carList.stream().filter(car -> car.getManufacturer().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() >= year)).toList();
            }
            case "=" -> {
                return carList.stream().filter(car -> car.getManufacturer().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() == year)).toList();
            }
            case "!=" -> {
                return carList.stream().filter(car -> car.getManufacturer().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() != year)).toList();
            }
        }
        return null;
    }


}
