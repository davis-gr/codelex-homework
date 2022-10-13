package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    List<Object> list = new ArrayList<>();

    public void add(int i, Object el) {
        list.add(i, el);
    }

    public Object get(int i) {
        return list.get(i);
    }

}
