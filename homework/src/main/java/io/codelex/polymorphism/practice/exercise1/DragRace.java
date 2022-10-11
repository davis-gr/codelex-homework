package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * * Which methods will be extracted with an empty body, and which can be default?
 * * 2. Create two more cars of your own choice.
 * * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        RedBull redbull = new RedBull();
        Scania scania = new Scania();

        List<Car> carList = new ArrayList<>();
        carList.add(audi);
        carList.add(bmw);
        carList.add(lexus);
        carList.add(tesla);
        carList.add(redbull);
        carList.add(scania);

        for (int i = 0; i < 10; i++) {
            for (Car car : carList) {
                car.speedUp();
                if (i == 2) {
                    car.useNitrousOxideEngine();
                }
            }
        }

//        carList.stream().max(???).toList();

        carList.sort(Comparator.comparingInt(Car::getCurrentSpeed).reversed());

        System.out.println(carList.get(0).showCurrentSpeed());

    }

}
