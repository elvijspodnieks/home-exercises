package io.codelex.oop.summary.parcels;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(110, 100, 101, 25, false);
        Parcel parcel2 = new Parcel(25, 30, 35, 5, true);
        Parcel parcel3 = new Parcel(50, 50, 50, 31, false);
        Parcel parcel4 = new Parcel(45, 36, 31, 26, true);
        Parcel parcel5 = new Parcel(31, 31, 60, 9, true);

        parcel1.validate();
        parcel2.validate();
        parcel3.validate();
        parcel4.validate();
        parcel5.validate();
    }
}
