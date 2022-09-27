package io.codelex.classesandobjects.practice.Ex1;

public class Main {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product epson = new Product("Epson EB-U05", 440.46, 1);

        System.out.println("Values ------------------------------");
        mouse.printProduct();
        phone.printProduct();
        epson.printProduct();

        mouse.setPriceAtStart(59.99);
        epson.setAmountAtStart(5);

        System.out.println("New values ---------------------------");
        mouse.printProduct();
        phone.printProduct();
        epson.printProduct();
    }
}
