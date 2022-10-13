package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GenericImplementation<V> {

    /*
    Implement the list using generic types.
    Advantages:
        – One method to rule them all
    Limitations:
        – Maybe difficult to understand initially
        – If method body needs to be different between subclasses, then new "add" method needs to be created still or the current needs to be overwritten.

    */

    private List<V> list = new ArrayList<>();

    public void add(int i, V el) {
        list.add(i, el);
    }

    public V get(int i) {
        return list.get(i);

    }
}
