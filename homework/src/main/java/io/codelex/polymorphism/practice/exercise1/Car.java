package io.codelex.polymorphism.practice.exercise1;

public interface Car extends Boost {

    void speedUp();

    void slowDown();

    String showCurrentSpeed();

    void startEngine();

    Integer getCurrentSpeed();

}
