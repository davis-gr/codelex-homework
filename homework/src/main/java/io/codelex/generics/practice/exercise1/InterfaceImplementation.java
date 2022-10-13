package io.codelex.generics.practice.exercise1;


public interface  InterfaceImplementation {

/*

Implement the list using one abstract class/interface and then (some) subclasses that implement it for different types.
Advantages:
    – Good if the method body needs to be different for each of the subclasses.
Limitations:
    – Still a lot of management and perhaps for some subclasses the method body can be the same - therefore code duplication will be present.
    – Some subclasses might not need this method at all, but there needs to be a placeholder for them if we are e.g. implementing an interface.
    – We need to define input/output value types. If we don't use generic types, it can be tricky if the values we use are not or do not extend the ones that are defined.
 */

    void add(int i, Object el);

    Object get(int i);


}
