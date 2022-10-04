package io.codelex.exceptions.practice;

public class Exercise2 {

    public static void main(String[] args) {
        methodA();
    }

    public static int methodA() throws ArithmeticException {
        try {
            return methodB();
        } catch (ArithmeticException a) {
            a.printStackTrace();
            throw new ArithmeticException();
        }
    }

    public static int methodB() throws ArithmeticException {
        try {
            return methodC();
        } catch (ArithmeticException a) {
            a.printStackTrace();
            throw new ArithmeticException();
        }
    }

    public static int methodC() throws ArithmeticException {
        try {
            return 26 / 0;
        } catch (ArithmeticException a) {
            a.printStackTrace();
            throw new ArithmeticException();
        }
    }
}
