package io.codelex.polymorphism.practice.exercise1;

import static org.apache.commons.lang3.ClassUtils.getSimpleName;

public class Scania implements Car, Boost {
    private final Integer acceleration;
    private final Integer boost;
    private Integer currentSpeed;

    public Scania() {
        this.currentSpeed = 0;
        this.acceleration = 5;
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
        System.out.println("DieselDieselDiesel...");
    }
}

