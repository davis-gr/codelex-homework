package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Start your animal generating process!");
        List<Animal> animals = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int counter = 0;
        Animal animal = null;
        while (true) {
            String[] input = in.nextLine().split(" ");
            if (input[0].equalsIgnoreCase("end")) {
                System.out.println(animals);
                break;
            }
            if (counter % 2 == 0) {
                if (input.length > 4) {
                    animal = new Cat(input[0], input[1], Double.parseDouble(input[2]), 0, input[3], input[4]);
                } else {
                    animal = switch (input[0]) {
                        case "Tiger" -> new Tiger(input[0], input[1], Double.parseDouble(input[2]), 0, input[3]);
                        case "Mouse" -> new Mouse(input[0], input[1], Double.parseDouble(input[2]), 0, input[3]);
                        case "Zebra" -> new Zebra(input[0], input[1], Double.parseDouble(input[2]), 0, input[3]);
                        default -> null;
                    };
                }
                animals.add(animal);
                animal.makeSound();
            } else {
                Food food;
                if (input[0].equals("Meat")) {
                    food = new Meat(Integer.parseInt(input[1]));
                } else {
                    food = new Vegetable(Integer.parseInt(input[1]));
                }
                animal.eat(food);
            }
            counter++;
        }
    }
}