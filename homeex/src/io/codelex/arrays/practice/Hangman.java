package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private final static String[] WORDS = {
            "recommendations", "zones", "grounds", "movement", "terms", "stadiums", "sport", "plans",
            "values", "football", "preparations", "team", "world", "champions", "expense", "time",
            "people", "happy", "public", "international", "decision", "minister", "seconds", "boat",
            "motor", "works", "purpose", "drone", "numbers", "summer", "police", "criminal"
    };


    public static String hiddenWord;
    public static char[] wordToGuess;
    public static char[] wordForWin;
    public static ArrayList<Character> missedLetters;

    public static boolean gameStart = true;

    public static void main(String[] args) {

        while (gameStart) {
            startNewGame();
            playGame();
            playAgain();
        }
    }

    private static void playGame() {
        while (!checkWin()) {
            Scanner in = new Scanner(System.in);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println(wordToGuess);
            System.out.print("Misses: ");

            for (Character missedLetter : missedLetters) {
                System.out.print(missedLetter);
                System.out.print(" ");
            }

            System.out.println();
            System.out.print("Guess: ");
            char letter = in.nextLine().charAt(0);
            if (checkIfContainsLetter(letter)) {
                updateWord(letter);
            } else if (!checkIfContainsMissedLetter(letter)) {
                missedLetters.add(letter);
            }

            if (missedLetters.size() >= (hiddenWord.length() * 2)) {
                System.out.println("You lose, too match missed char.");
                System.out.println(wordForWin);
                break;
            }

            if (checkWin()) {
                System.out.println(wordToGuess);
                System.out.println("YOU GOT IT!");
                break;
            }
        }
    }

    private static void startNewGame() {
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        hiddenWord = WORDS[index];
        missedLetters = new ArrayList<>();
        wordForWin = hiddenWord.replaceAll(".(?!$)", "$0 ").toCharArray();
        wordToGuess = hiddenWord.replaceAll("\\w", "_ ").toCharArray();
    }

    private static void updateWord(char a) {
        for (int i = 0; i < wordToGuess.length - 1; i++) {
            if (wordForWin[i] == a) {
                wordToGuess[i] = a;
            }
        }
    }

    private static boolean checkIfContainsLetter(char letter) {
        for (Character chr : wordForWin) {
            if (chr == letter) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIfContainsMissedLetter(char letter) {
        for (Character missedLetter : missedLetters) {
            if (missedLetter == letter) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWin() {
        char[] wordToGuess2 = Arrays.copyOf(wordToGuess, wordToGuess.length - 1);
        return Arrays.equals(wordForWin, wordToGuess2);
    }

    private static void playAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Play \"again\" or \"quit\"? ");
        String starGame = sc.nextLine().toLowerCase();
        if (starGame.equals("again")) {
            gameStart = true;
        } else {
            System.out.println("Thanks for playing!");
            gameStart = false;
        }
    }
}
