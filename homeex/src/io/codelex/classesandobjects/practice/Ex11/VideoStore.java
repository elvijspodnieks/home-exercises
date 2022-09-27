package io.codelex.classesandobjects.practice.Ex11;

import java.util.LinkedList;
import java.util.List;

public class VideoStore {
    private static final List<Video> inventory = new LinkedList<>();

    public static void addToInventory(String title) {
        Video newVideo = new Video(title);
        inventory.add(newVideo);
    }

    public static void listInventory() {
        System.out.println("Store has following videos:");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.print(i + "\t");
            System.out.println(inventory.get(i).toString());
        }
    }

    static String checkOutVideo(String title) {
        Video video = null;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getTitle().equals(title)) {
                video = inventory.get(i);
            }
        }

        if (video == null) {
            return "Video not found!";
        }
        if (video.isCheckedOut()) {
            return "Video not available!";
        }
        video.setCheckedOut();
        return "Video checked out successfully!";
    }

    static String returnVideo(String title) {
        Video video = null;
        for (Video value : inventory) {
            if (value.getTitle().equals(title)) {
                video = value;
            }
        }
        if (video == null) {
            return "Video not found!";
        }
        if (!video.isCheckedOut()) {
            return "Impossible to return a video that's not checked out!";
        }
        video.setReturned();
        return "Video returned successfully!";
    }


    public static void rateVideo(String title, int rate) {

        Video video = null;
        for (Video value : inventory) {
            if (value.getTitle().equals(title)) {
                video = value;
            }
        }
        video.rate(rate);
    }
}
