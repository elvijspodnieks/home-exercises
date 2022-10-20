package io.codelex.oop.summary.computers;

import java.util.Objects;

public class Laptop extends Computer {

    private String battery;

    public Laptop(String processor, String ram, String graphicCard, String company, String model, String battery) {
        super(processor, ram, graphicCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery='" + getBattery() + '\'' +
                ", processor='" + getProcessor() + '\'' +
                ", ram='" + getRam() + '\'' +
                ", graphicCard='" + getGraphicCard() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
