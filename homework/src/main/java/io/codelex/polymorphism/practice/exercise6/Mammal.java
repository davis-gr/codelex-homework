package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {

    private final String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        return getAnimalName() + ", " + getFormattedWeight() + ", " + getLivingRegion() + ", " + getFoodEaten();
    }
}
