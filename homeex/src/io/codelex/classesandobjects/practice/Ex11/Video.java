package io.codelex.classesandobjects.practice.Ex11;

import java.util.ArrayList;

public class Video {
    private String title;
    private boolean checkedOut = false;
    private double averageRating;
    private final ArrayList<Integer> ratings = new ArrayList<>();

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setCheckedOut() {
        checkedOut = true;
    }

    public void setReturned() {
        checkedOut = false;
    }

    public void rate(int rating) {
        ratings.add(rating);
        averageRating = ratings.stream().mapToInt(val -> val).average().orElse(0.0);
    }


    @Override
    public String toString() {
        return "Title: '" + title + '\'' +
                "   Rating: " + String.format("%.2f", averageRating) +
                "   Is avaliable: " + checkedOut;
    }

}
