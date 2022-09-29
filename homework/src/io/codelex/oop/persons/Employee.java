package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {

    private String position;
    private final LocalDate startedWorking;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Employee(String firstname, String lastname, String id, int age, String position, String startedWorking) {
        super(firstname, lastname, id, age);
        this.position = position;
        this.startedWorking = LocalDate.parse(startedWorking, formatter);
    }

    @Override
    public String getInfo() {
        return String.format("%s %s %s (%d years)", position, getFirstname(), getLastname(), getWorkExperience());
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorking.getYear();
    }
}
