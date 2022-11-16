package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private double price;
    private int yearOfManufacturing;
    private List<Manufacturer> manufacturer;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacturing, EngineType engineType, Manufacturer... manufacturer) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.manufacturer = new ArrayList<>();
        this.engineType = engineType;
        this.manufacturer.addAll(Arrays.asList(manufacturer));
        ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void addManufacturer(Manufacturer... manufacturer) {
        this.manufacturer.addAll(Arrays.asList(manufacturer));
    }

    public EngineType getEngineType() {
        return engineType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(car.getPrice(), getPrice()) == 0 && getYearOfManufacturing() == car.getYearOfManufacturing()
                && getName().equals(car.getName()) && getModel().equals(car.getModel())
                && getManufacturer().equals(car.getManufacturer()) && getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice(), getYearOfManufacturing(), getManufacturer(), getEngineType());
    }

    @Override
    public String toString() {
        return "\n\t - " + name + " " + model + " (" + engineType + ", " + yearOfManufacturing + "), price: " + (int) price + ", made by: " + manufacturer;
    }
}
