package io.codelex.polymorphism.practice.exercise3;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Harry", "Potter", "4 Privet Drive", 42, 8.5);
        Employee employee = new Employee("Severus", "Snape", "10 Spinner's End", 666, "Potions Master");

        student.display();
        employee.display();

    }
}
