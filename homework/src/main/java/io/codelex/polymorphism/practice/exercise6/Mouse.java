package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("...scrap scrap...");
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
        return "Mouse[" + super.toString() + "]";
    }
}
