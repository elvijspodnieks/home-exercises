package io.codelex.classesandobjects.practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

//-------------------Elvijs Podnieks-------------------
public class Author {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private LocalDate now = LocalDate.now();
    public ArrayList<String> books = new ArrayList<String>();


    static long BOOKS_IN_THE_WORLD = 129864880;

    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void addBook(String book) {
        this.books.add(book);
    }

    public int getAge() {
        Period period = now.until(dateOfBirth);
        return Math.abs(period.getYears());
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean hasWrittenBook(String alice_in_wonderland) {
        if (books.contains(alice_in_wonderland)) {
            return true;
        } else {
            return false;
        }
    }

    public void printAllInfo() {
        System.out.println(getFullName());
        System.out.println("His age is " + getAge() + " at the moment");
        System.out.println("He has written " + books.size() + " books.");

    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", books=" + books +
                '}';
    }
}
