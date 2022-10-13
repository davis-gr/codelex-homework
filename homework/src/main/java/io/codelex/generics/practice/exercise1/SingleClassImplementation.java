package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class SingleClassImplementation {

    /*
    Implement the list using only one class without generics.
    Advantages:
        – Easier to understand
    Limitations:
        – There need to be as many "add" methods as there are classes requiring it.
        – If a new class is created - a new "add" method needs to be created as well
     */

    List<String> list = new ArrayList<>();

    public void add(int i, String el) {
        list.add(i, el);
    }

    public String get(int i) {
        return list.get(i);
    }

}
