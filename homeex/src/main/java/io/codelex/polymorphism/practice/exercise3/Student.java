package main.java.io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {

    private double gpa;

    public Student(String firstName, String lastName, String adress, int id, double gpa) {
        super(firstName, lastName, adress, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Adress: " + getAdress());
        System.out.println("ID: " + getId());
        System.out.println("GPA: " + getGpa());

    }
}
