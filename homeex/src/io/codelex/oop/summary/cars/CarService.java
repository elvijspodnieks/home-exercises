package io.codelex.oop.summary.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();
    }

    public List getCarList() {
        return carList;
    }

    public void addToList(Car car) {
        carList.add(car);
    }

    public void removeFromList(Car car) {
        carList.remove(car);
    }

    public List<Car> getV12() {
        return carList.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .toList();
    }

    public List<Car> carsBefore1999() {
        return carList.stream()
                .filter(car -> car.getYearOfManufacturing() < 1999)
                .toList();
    }

    public Car mostExpensive() {
        carList.sort(Comparator.comparing(Car::getPrice));
        return carList.get(carList.size() - 1);
    }

    public Car mostCheaper() {
        carList.sort(Comparator.comparing(Car::getPrice));
        return carList.get(0);
    }

    public List<Car> carsWithAtLeast3Manufactuers() {
        return carList.stream()
                .filter(car -> car.manufacturer.size() >= 3)
                .toList();
    }


    public List<Car> sort(String sortingMethod) {
        if (sortingMethod.equals("ascending")) {
            carList.sort(Comparator.comparing(Car::getYearOfManufacturing));
        } else {
            carList.sort(Comparator.comparing(Car::getYearOfManufacturing).reversed());
        }
        return carList;
    }

    public boolean checkIfCarInService(Car car) {
        if (carList.contains(car)) {
            return true;
        } else {
            return false;
        }
    }

    public List<Car> listByManufacturer(Manufacturer audi) {
        return carList.stream()
                .filter(car -> car.getManufacturer().contains(audi))
                .toList();
    }

    public List<Car> filterByYears(String comparator, int year) {
        if (comparator.equals(">")) {
            return carList.stream()
                    .filter(car -> car.getYearOfManufacturing() > year).toList();
        } else if (comparator.equals("<")) {
            return carList.stream()
                    .filter(car -> car.getYearOfManufacturing() < year).toList();
        } else if (comparator.equals("<=")) {
            return carList.stream()
                    .filter(car -> car.getYearOfManufacturing() <= year).toList();
        } else if (comparator.equals(">=")) {
            return carList.stream()
                    .filter(car -> car.getYearOfManufacturing() >= year).toList();
        } else if (comparator.equals("=")) {
            return carList.stream()
                    .filter(car -> car.getYearOfManufacturing() == year).toList();
        } else if (comparator.equals("!=")) {
            return carList.stream()
                    .filter(car -> car.getYearOfManufacturing() != year).toList();
        } else {
            return null;
        }

    }
}
