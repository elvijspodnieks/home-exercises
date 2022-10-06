package main.java.io.codelex.excep;

import java.io.File;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {

    public static void main(String[] args) throws IOException {
        File newFile = new File("aa");
        cat(newFile);
    }

    public static void cat(File file) throws IOException {

        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}

