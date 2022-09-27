package io.codelex.classesandobjects.practice.Ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG-13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movies = new Movie[]{movie1, movie2, movie2};
        System.out.println(getPG(movies));


    }

    static ArrayList<Movie> getPG(Movie[] movies) {

        ArrayList<Movie> moviesWithRatingPG = new ArrayList<>();
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                moviesWithRatingPG.add(movies[i]);
            }

        }
        return moviesWithRatingPG;

    }


}
