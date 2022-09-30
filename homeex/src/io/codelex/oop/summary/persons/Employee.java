package io.codelex.oop.summary.persons;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Employee(String firstName, String lastName, String id, int age, String position, String startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = LocalDate.parse(startedWorking, formatter);
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorking.getYear();
    }

    @Override
    public String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + ", " + getWorkExperience() + " years.";
    }
}
