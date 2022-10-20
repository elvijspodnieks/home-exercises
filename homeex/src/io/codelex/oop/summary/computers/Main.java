package io.codelex.oop.summary.computers;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer("i3", "8gb", "NVIDIA 3000", "Asus", "3213");
        Computer pc2 = new Computer("i5", "16gb", "GeForce RTX 3060", "Gigabyte", "2314");
        Computer pc3 = new Computer("i7", "32gb", "Nvidia Tesla T4", "Asus", "1322");

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc1.equals(pc2));
        System.out.println(pc1.getCompany().equals(pc3.getCompany()));

        Laptop laptop = new Laptop("i5", "8gb", "GeForce RTX 30", "Asus", "90931", "5000mah");
        System.out.println(laptop);

    }
}
