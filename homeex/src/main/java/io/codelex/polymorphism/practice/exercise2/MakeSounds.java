package main.java.io.codelex.polymorphism.practice.exercise2;

import main.java.io.codelex.polymorphism.practice.exercise1.Car;
import main.java.io.codelex.polymorphism.practice.exercise1.FastCar;

import java.util.ArrayList;

public class MakeSounds {
    public static void main(String[] arg) {
        ArrayList<Sound> sounds = new ArrayList<>();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();

        sounds.add(parrot);
        sounds.add(radio);
        sounds.add(firework);

        for (int i = 0; i < 10; i++) {
            for (Sound sound : sounds) {
                sound.playSound();
            }
        }
    }
}
