package main.java.io.codelex.polymorphism.practice.exercise5;

public class PosterAd extends Advert {
    private String dimensions;
    private int numOfCopies;
    private int costPerCopy;


    public PosterAd(int fee, String dimensions, int numOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numOfCopies = numOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        if (dimensions.equals("A4")) {
            return super.cost() + (numOfCopies * costPerCopy);
        } else if (dimensions.equals("A3")) {
            return Math.round(super.cost() + Math.round((numOfCopies * costPerCopy) * 1.2));
        } else if (dimensions.equals("A2")) {
            return Math.round(super.cost() + Math.round((numOfCopies * costPerCopy) * 1.4));
        } else if (dimensions.equals("A5")) {
            return Math.round(super.cost() + Math.round((numOfCopies * costPerCopy) * 0.8));
        } else {
            return super.cost() + (numOfCopies * costPerCopy);
        }

    }

    public String toString() {
        return super.toString()
                + " Dimensions: " + dimensions + "."
                + " Number of copies: " + numOfCopies
                + " Cost per copy: " + costPerCopy;
    }
}

