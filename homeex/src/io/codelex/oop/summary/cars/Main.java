package io.codelex.oop.summary.cars;

public class Main {
    public static void main(String[] args) {
        Manufacturer raf = new Manufacturer("Rīgas Autobusu Fabrika", 1949, "Latvia");
        Manufacturer audi = new Manufacturer("Audi", 1909, "Germany");
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer lada = new Manufacturer("Lada", 1973, "Russia");
        Manufacturer ford = new Manufacturer("Ford", 1903, "USA");
        Manufacturer vw = new Manufacturer("Volkswagen", 1937, "Germany");


        Car audia4 = new Car("Audi", "A4", 43000, 2004, EngineType.V12, audi, vw, bmw);
        Car audia6 = new Car("Audis", "A6", 53000, 2021, EngineType.V12, audi);
        Car skoda = new Car("Skoda", "Rapid", 23000, 2022, EngineType.S4, vw);
        Car gc420d = new Car("BMW", "420d", 20000, 2015, EngineType.S4, bmw);
        Car m760Li = new Car("BMW", "M760Li", 63000, 2017, EngineType.V12, bmw);
        Car old = new Car("Ford", "Transit", 820, 1991, EngineType.S3, ford);

        CarService service = new CarService();
        service.addToList(audia4);
        service.addToList(audia6);
        service.addToList(gc420d);
        service.addToList(old);
        service.addToList(m760Li);

        System.out.println("--------------------------");
        System.out.println("Cars with V12");
        System.out.println(service.getV12());
        System.out.println("--------------------------");
        System.out.println("Cars before 1999");
        System.out.println(service.carsBefore1999());
        System.out.println("--------------------------");
        System.out.println("Most expesive cars");
        System.out.println(service.mostExpensive());
        System.out.println(service.sort("ascending"));
        System.out.println(service.sort("descending"));
        System.out.println("--------------------------");
        System.out.println("Check if car in service");
        System.out.println(service.checkIfCarInService(audia4));
        System.out.println(service.checkIfCarInService(skoda));
        System.out.println("--------------------------");
        System.out.println("Car list by manufactures");
        System.out.println(service.listByManufacturer(audi));
        System.out.println("--------------------------");
        System.out.println("Car with at least 3 manufactures");
        System.out.println(service.carsWithAtLeast3Manufactuers());
        System.out.println("--------------------------");
        System.out.println("Car filtered by years");
        System.out.println(service.filterByYears("<", 2015));


    }

}
