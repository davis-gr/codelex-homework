package io.codelex.oop.runners;

public enum Runner {

    BEGINNER(241, 9999),
    INTERMEDIATE(181, 240),
    ADVANCED(0, 180);


    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    static Runner getFitnessLevel(int time) {
        if (time <= ADVANCED.maxTime) {
            return Runner.ADVANCED;
        }
        else if (time >= BEGINNER.minTime) {
            return Runner.BEGINNER;
        } else {
            return Runner.INTERMEDIATE;
        }
    }

}

