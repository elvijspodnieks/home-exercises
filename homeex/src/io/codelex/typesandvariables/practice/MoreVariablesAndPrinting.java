package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String myName = "Zed A. Shaw";
        int age = 35;
        double height = 74 * 2.54;  // inches to cm
        double weight = 180 * 0.453592; // lbs to kg
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";


        System.out.println("Let's talk about " + myName + ".");
        System.out.println("He's " + height + " cm tall.");
        System.out.println("He's " + String.format("%.2f",weight) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + String.format("%.2f",weight)
                + " I get " + String.format("%.2f",age + height + weight) + ".");
    }
}