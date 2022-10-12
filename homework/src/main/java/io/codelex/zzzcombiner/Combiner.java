package io.codelex.zzzcombiner;

import java.util.function.BiFunction;

public class Combiner<T, S, X> {

    private T one;
    private S two;

    private BiFunction<T, S, String> function;

    public Combiner(T one, S two, BiFunction<T, S, String> function) {
        this.one = one;
        this.two = two;
        this.function = function;
    }

    public String combine() {
        return function.apply(one, two);
    }

}
