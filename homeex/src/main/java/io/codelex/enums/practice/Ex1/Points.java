package main.java.io.codelex.enums.practice.Ex1;

public enum Points {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    String direction;

    Points(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
