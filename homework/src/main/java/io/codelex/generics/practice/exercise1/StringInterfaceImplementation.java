package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringInterfaceImplementation implements InterfaceImplementation {

    List<String> list = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        list.add(i, (String) el);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }
}
