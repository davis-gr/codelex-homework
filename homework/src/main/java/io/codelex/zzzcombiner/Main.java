package io.codelex.zzzcombiner;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        Combiner<Integer, String, BiFunction<Integer, String, String>> combiner = new Combiner<>(10, "Teksts", (a, b) -> a.toString() + "-" + b.toString());
        String result = combiner.combine();
        System.out.println(result);

    }
}
