package io.codelex.oop.persons;

public abstract class Person {

    private String firstname;
    private String lastname;
    private String id;
    private int age;

    public Person(String firstname, String lastname, String id, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public abstract String getInfo();
}
