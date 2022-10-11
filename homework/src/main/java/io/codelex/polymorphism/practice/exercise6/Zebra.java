package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Horse sounds, but in Zebra");
    }

    @Override
    void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            System.out.println(this.getAnimalType() + "s are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity());
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Zebra[" + getAnimalName() + ", " + getAnimalWeight() + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
