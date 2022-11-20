package io.codelex.polymorphism.practice.exercise1;

import static org.apache.commons.lang3.ClassUtils.getSimpleName;

public class Bmw implements Car {
    private final Integer acceleration;
    private Integer currentSpeed;

    public Bmw() {
        this.currentSpeed = 0;
        this.acceleration = 12;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp() {
        currentSpeed += acceleration;
    }

    public void slowDown() {
        currentSpeed -= acceleration;
    }

    public String showCurrentSpeed() {
        return getSimpleName(this) + " - " + currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    public void useNitrousOxideEngine() {
    }
}
