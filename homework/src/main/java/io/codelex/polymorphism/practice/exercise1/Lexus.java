package io.codelex.polymorphism.practice.exercise1;

import static org.apache.commons.lang3.ClassUtils.getSimpleName;

public class Lexus implements Car, Boost {
    private final Integer acceleration;
    private final Integer boost;
    private Integer currentSpeed;

    public Lexus() {
        this.currentSpeed = 0;
        this.acceleration = 8;
        this.boost = 30;
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

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + boost;
    }

    public void startEngine() {
        System.out.println("Bzzzzzz.....");
    }
}
