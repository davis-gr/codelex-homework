package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
}
