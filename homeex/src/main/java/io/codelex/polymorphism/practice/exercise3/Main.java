package main.java.io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Smith", "NY, Big street 123332123", 24123, "Homeless");
        Student student = new Student("Peter", "Wick", "Riga, Valdemara 78", 87603, 2332);

        employee.display();
        student.display();
    }


}
