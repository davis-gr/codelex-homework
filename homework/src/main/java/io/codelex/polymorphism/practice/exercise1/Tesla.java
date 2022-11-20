package io.codelex.polymorphism.practice.exercise1;

import static org.apache.commons.lang3.ClassUtils.getSimpleName;

public class Tesla implements Car {
    private final Integer acceleration;
    private Integer currentSpeed;

    public Tesla() {
        this.currentSpeed = 0;
        this.acceleration = 20;
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
        System.out.println("-- silence ---");
    }

    public void useNitrousOxideEngine() {
    }
}
