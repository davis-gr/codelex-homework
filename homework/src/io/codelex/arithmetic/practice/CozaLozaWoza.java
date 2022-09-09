package io.codelex.arithmetic.practice;

public class CozaLozaWoza {

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 110;

        for (int i = lowerBound; i <= upperBound; i++) {
            String outputString;

            StringBuilder cozalozawoza = new StringBuilder();

            if (i % 3 == 0) {
                cozalozawoza.append("Coza");
            }

            if (i % 5 == 0) {
                cozalozawoza.append("Loza");
            }

            if (i % 7 == 0) {
                cozalozawoza.append("Woza");
            }

            outputString = cozalozawoza.toString();

            if (!outputString.equals("")) {
                System.out.print(outputString + " ");
            } else System.out.print(i + " ");

            if (i % 11 == 0) {
                System.out.println();
            }

        }

    }
}
