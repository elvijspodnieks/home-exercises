package main.java.io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        String[] keys = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};

        //todo - replace array with an ArrayList and print out the results

        List<String> carList = new ArrayList<>();
        System.out.println("--------ArrayList----------");
        Collections.addAll(carList, array);
        System.out.println(carList);
        System.out.println();

        //todo - replace array with a HashSet and print out the results

        Set<String> cars = new HashSet<>();
        Collections.addAll(cars, array);
        System.out.println("---------HashSet-----------");
        for (String car : cars) {
            System.out.print(car + ", ");
        }
        System.out.println();
        System.out.println();

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results

        System.out.println("---------HashMap-----------");
        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], keys[i]);
        }
        System.out.println(map);

    }
}
