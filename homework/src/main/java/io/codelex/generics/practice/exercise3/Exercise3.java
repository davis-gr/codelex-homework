package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {


        /*

public void add(Object value, List<?> list) {
    list.add(value);
}
The Java compiler rejects this program, with the following message:

The method add(capture#1-of ?) in the type List<capture#1-of ?> is not applicable for the arguments (Object)

Explain why we obtain such an error.
    – We get this error because List can accept any data type, but value can only contain an object.
      So as these types are not the same and list could contain something different than an Object (e.g. String or Integer or another custom made Class that extends Object), Java does not allow to add that Object to List.
 */

        Employee employee = new Employee("Albus Dumbledore", "Headmaster");
        Person person = new Person("He-Who-Must-Not-Be-Named");

        List<Employee> employeeList = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        employeeList.add(employee);
        personList.add(person);


        // This two lines below prove that addAllX is less restrictive than addAllY. addAllY throws an error of type incompatibility, while addAllX runs just fine for the same List concatenation exercise:
//        addAllX(employeeList, personList);
//        addAllY(employeeList, personList);


    }


//    Fix the program by using a generic type for the parameter of method add and constraining the wildcard appropriately.
    public <T> void add(T value, List<? super T> list) {
        list.add(value);
    }

//    We can use the following alternative signature for add: public <V> void add(V value, List<V> list) Is this solution more restricted than the one obtained using the wildcard?
    // This solution is more restricted than the one obtained using the wildcard. Above is an example why (line 35).



    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for(V el : v) l.add(el);
    }
    public static <V> void addAllY(List<V> v, List<V> l) {
        for(V el : v) l.add(el);
    }

}


