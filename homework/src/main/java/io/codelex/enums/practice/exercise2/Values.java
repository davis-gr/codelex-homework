package io.codelex.enums.practice.exercise2;

public enum Values {

    SCISSOR,
    PAPER,
    STONE,
    QUIT;

    public static Values getValueByInt(int value) {
        return Values.values()[value];
    }

    public static Values getValueByLetter(String s) {
        return switch (s) {
            case "s" -> Values.SCISSOR;
            case "p" -> Values.PAPER;
            case "t" -> Values.STONE;
            case "q" -> Values.QUIT;
            default -> null;
        };
    }

}
