package io.codelex.generics.practice.exercise3;

public class Employee extends Person {

private String title;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
                " title='" + title + '\'' +
                '}';
    }
}
