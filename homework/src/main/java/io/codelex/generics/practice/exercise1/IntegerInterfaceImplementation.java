package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class IntegerInterfaceImplementation implements InterfaceImplementation {

    List<Integer> list = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        list.add(i, (Integer) el);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }

}
