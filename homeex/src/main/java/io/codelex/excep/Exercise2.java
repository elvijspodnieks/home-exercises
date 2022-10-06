package main.java.io.codelex.excep;

public class Exercise2 {

    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println(
                    "Divided by zero operation cannot possible");
        }

    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println(
                    "Divided by zero operation cannot possible");
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println(
                    "Divided by zero operation cannot possible");
        }

    }

    public static void methodC() throws ArithmeticException {
        System.out.println(1 / 0);
    }


}