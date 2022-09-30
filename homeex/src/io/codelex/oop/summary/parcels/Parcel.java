package io.codelex.oop.summary.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("Total sum of dimensions cannot be greater than 300");
            return false;
        } else if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Each dimension must be greater than 30 ");
            return false;
        } else if (!isExpress && weight > 30) {
            System.out.println("Too heavy, weight over 30!");
            return false;
        } else if (isExpress && weight > 15) {
            System.out.println("Too heavy, weight over 15!");
            return false;
        } else {
            System.out.println("The parcel will be sent out");
            return true;
        }
    }
}
