package io.codelex.kontroldarbs.exercise3;

import java.util.ArrayList;
import java.util.List;


public class Joiner<T> {

        private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... values) {

        ArrayList<T> list = new ArrayList<>(List.of(values));
        return String.join(separator,list.stream().map(Object::toString).toList());

    }


}
