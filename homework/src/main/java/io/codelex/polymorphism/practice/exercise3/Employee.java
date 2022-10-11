package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {

    private String title;

    public Employee(String firstName, String lastName, String address, int id, String title) {
        super(firstName, lastName, address, id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("ID: " + getId() + ", firstName: " + getFirstName() + ", lastName: " + getLastName() + ", address: " + getAddress() + ", title: " + getTitle());
        ;
    }
}
