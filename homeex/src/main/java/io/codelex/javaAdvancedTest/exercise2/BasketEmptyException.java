package io.codelex.javaAdvancedTest.exercise2;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException (String error){
        super(error);
    }
}
