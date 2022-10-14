package io.codelex.javaAdvancedTest.exercise4;

import java.io.*;

public class Main {
    private static final String PATH_TO_APP = "/Users/elvijspodnieks/Documents/java/home-exercises/homeex/src/main/java/io/codelex/javaAdvancedTest/exercise4/";
    public static void main(String[] args) throws IOException {
        String readFile = "SampleText.txt";
        String[] nameArray = readFile.split("\\.");
        String writeFileArray = nameArray[0];
        String name = new StringBuilder(writeFileArray).reverse().toString();
        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + readFile));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + name));

        String line;
        while ((line = in.readLine()) != null) {
            String reverseString = new StringBuilder(line).reverse().toString();
            out.write(reverseString + "\n");
        }
        in.close();
        out.close();
    }

}

