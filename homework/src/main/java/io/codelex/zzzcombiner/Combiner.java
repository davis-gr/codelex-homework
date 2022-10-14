package io.codelex.zzzcombiner;

import java.util.function.BiFunction;

public class Combiner<T, S> {

    private T one;
    private S two;

    private BiFunction<T, S, String> function;

    public Combiner(T one, S two) {
        this.one = one;
        this.two = two;
        this.function = (a, b) -> a.toString() + "-" + b.toString();
    }

    public String combine() {
        return function.apply(one, two);
    }

}
