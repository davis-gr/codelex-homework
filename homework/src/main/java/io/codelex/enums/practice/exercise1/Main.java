package io.codelex.enums.practice.exercise1;

public class Main {

    public static void main(String[] args) {
        for (Directions direction : Directions.values()) {
            System.out.println(direction + ":" + direction.arrowDirection + ":" + direction.ordinal());
        }
    }
}
