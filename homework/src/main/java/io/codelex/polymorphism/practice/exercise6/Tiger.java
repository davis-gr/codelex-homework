package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {

    public Tiger(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("BIG ANGRY MEOW");
    }

    @Override
    void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            System.out.println(this.getAnimalType() + "s are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity());
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Tiger[" + getAnimalName() + ", " + getAnimalWeight() + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
