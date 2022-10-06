package io.codelex.enums.practice.exercise1;

public enum Directions {

    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    public final String arrowDirection;

    Directions(String arrowDirection) {
        this.arrowDirection = arrowDirection;
    }
}
