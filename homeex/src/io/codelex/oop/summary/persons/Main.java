package io.codelex.oop.summary.persons;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Smith", "ABC123", 55, "Accountant", "01.01.2007");
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Anne", "Peterson", "ABC122", 23, "BBZ2B4", 12);
        System.out.println(customer.getInfo());

        customer.setPurchaseCount(4);
        System.out.println(customer.getInfo());

    }
}
