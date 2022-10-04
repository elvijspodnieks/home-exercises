package io.codelex.classesandobjects.practice.Ex4;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;


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

    public static ArrayList<Movie> moviesWithPGRating(ArrayList<Movie> movies) {

        ArrayList<Movie> pgMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies.add(movie);
                movie.printMovie();
            }
        }
        return movies;
    }

    public void printMovie() {
        System.out.println("Title: " + this.title + ", Studio: " + this.studio + ", Rating: " + this.rating);
    }

}
