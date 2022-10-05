package io.codelex.classesandobjects.practice.Ex11;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {


        VideoStore.listInventory();
        VideoStore.addToInventory("The Matrix");
        VideoStore.addToInventory("Godfather II");
        VideoStore.addToInventory("Star Wars Episode IV: A New Hope");


        VideoStore.rateVideo("The Matrix", 8);
        VideoStore.rateVideo("The Matrix", 6);
        VideoStore.rateVideo("The Matrix", 9);
        VideoStore.rateVideo("Godfather II", 8);
        VideoStore.rateVideo("Godfather II", 9);
        VideoStore.rateVideo("Star Wars Episode IV: A New Hope", 7);


        VideoStore.checkOutVideo("The Matrix");
        System.out.println(VideoStore.checkOutVideo("Godfather II"));
        VideoStore.listInventory();
        VideoStore.checkOutVideo("Star Wars Episode IV: A New Hope");

        VideoStore.returnVideo("The Matrix");
        VideoStore.returnVideo("Godfather II");
        VideoStore.returnVideo("Star Wars Episode IV: A New Hope");
        VideoStore.listInventory();


    }
}
