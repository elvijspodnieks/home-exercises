package io.codelex.classesandobjects.practice.Ex4;

public class Movie {
    private String title;
    private String studio;
    String rating;


    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }

}
