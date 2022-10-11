package main.java.io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {

    private String jobTitle;

    public Employee(String firstName, String lastName, String adress, int id, String jobTitle) {
        super(firstName, lastName, adress, id);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void display() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Adress: " + getAdress());
        System.out.println("ID: " + getId());
        System.out.println("Job title: " + getJobTitle());
    }

}
