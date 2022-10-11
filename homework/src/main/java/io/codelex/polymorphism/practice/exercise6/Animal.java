package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {

    private final String animalName;
    private final String animalType;
    private final Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalType, String animalName, Double animalWeight, Integer foodEaten) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    abstract void makeSound();
    abstract void eat(Food food);

    @Override
    public String toString() {
        return animalName + ", " + animalType + ", " + animalWeight + ", " + foodEaten;
    }
}
