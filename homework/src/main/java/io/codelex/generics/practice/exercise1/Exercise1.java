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

    /*
Implement the list and discuss the advantages and the limitations of the three different approaches below.

Implement the list using only one class without generics.
    Advantages:
        – Easier to understand
    Limitations:
        – There need to be as many "add" methods as there are classes requiring it.
        – If a new class is created - a new "add" method needs to be created as well
Implement the list using one abstract class/interface and then (some) subclasses that implement it for different types.
    Advantages:
        – Good if the method body needs to be different for each of the subclasses.
    Limitations:
        – Still a lot of management and perhaps for some subclasses the method body can be the same - therefore code duplication will be present.
        – Some subclasses might not need this method at all, but there needs to be a placeholder for them if we are e.g. implementing an interface.
Implement the list using generic types.
    Advantages:
        – One method to rule them all
    Limitations:
        – Maybe difficult to understand initially
        – If method body needs to be different between subclasses, then new "add" method needs to be created still.
     */

}
