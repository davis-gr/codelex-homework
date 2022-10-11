package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {

    private final String breed;

    public Cat(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowww");
    }

    @Override
    void eat(Food food) {
        this.setFoodEaten(food.getQuantity());
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat[" + getAnimalName() + ", " + this.breed + ", " + getAnimalWeight() + ", " + getLivingRegion() + ", " + getFoodEaten()+ "]";
    }
}
