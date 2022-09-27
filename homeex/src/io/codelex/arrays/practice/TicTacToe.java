package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        initBoard();
        displayBoard();
        int counter = 0;
        char player = '0';

        System.out.println("'" + player + "', choose your location (row, column): ");
        while (counter < 9) {
            String[] input = keyboard.nextLine().split(" ");
            int r = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            if (board[r][c] == ' ') {
                board[r][c] = player;
                counter++;
                displayBoard();

                if (winCheck()) {
                    System.out.println("The winner is " + player);
                    break;
                } else {
                    if (player == '0') {
                        player = 'X';
                    } else {
                        player = '0';
                    }
                    System.out.println("'" + player + "', choose your location (row, column): ");
                }
            } else {
                System.out.println("Please enter valid location!");
            }
        }
        System.out.println("The game is a tie.");
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static Boolean winCheck() {
        boolean isWinner = false;
        if ((board[0][0] != ' ') && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])) {
            isWinner = true;
        }
        if ((board[1][0] != ' ') && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])) {
            isWinner = true;
        }
        if ((board[2][0] != ' ') && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2])) {
            isWinner = true;
        }
        if ((board[0][0] != ' ') && (board[0][0] == board[1][0]) && (board[1][0] == board[2][0])) {
            isWinner = true;
        }
        if ((board[0][1] != ' ') && (board[0][1] == board[1][1]) && (board[1][1] == board[2][1])) {
            isWinner = true;
        }
        if ((board[0][2] != ' ') && (board[0][2] == board[1][2]) && (board[1][2] == board[2][2])) {
            isWinner = true;
        }
        if ((board[0][0] != ' ') && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2])) {
            isWinner = true;
        }
        if ((board[2][0] != ' ') && (board[2][0] == board[1][1]) && (board[1][1] == board[0][2])) {
            isWinner = true;
        }
        return isWinner;
    }

}