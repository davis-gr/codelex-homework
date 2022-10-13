package io.codelex.generics.practice.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.codelex.generics.practice.exercise3.Exercise3.*;

public class Exercise3Test {

    @Test
    void testAddAllX() {
        //Given
        Employee employee = new Employee("Albus Dumbledore", "Headmaster");
        Person person = new Person("He-Who-Must-Not-Be-Named");

        List<Employee> employeeList = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        employeeList.add(employee);
        personList.add(person);
        //When
        String result = addAllX(employeeList, personList).toString();
        //Then
        Assertions.assertEquals("[Person{name='He-Who-Must-Not-Be-Named'}, Person{name='Albus Dumbledore'} title='Headmaster'}]", result);
    }

}
