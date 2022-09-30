package io.codelex.oop.summary.cars;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int year, String country) {
        this.name = name;
        this.yearOfEstablishment = year;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return yearOfEstablishment;
    }

    public void setYear(int year) {
        this.yearOfEstablishment = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

    @Override
    public String toString() {
        return name;
    }
}
