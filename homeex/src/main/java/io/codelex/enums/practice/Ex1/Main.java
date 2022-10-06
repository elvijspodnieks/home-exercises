package main.java.io.codelex.enums.practice.Ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Points.NORTH.getDirection());
        System.out.println(Points.WEST.getDirection());
        System.out.println(Points.EAST.getDirection());
        System.out.println(Points.SOUTH.getDirection());

        
        for (Points direction : Points.values()) {
            System.out.println(direction + ":" + direction.getDirection() + ":" + direction.ordinal());
        }
    }
}
