package io.codelex.kontroldarbs.exercise4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileReader {

    private static final String PATH_TO_FILE = "C:\\Users\\davis\\Desktop\\codelex_homework\\codelex-homework\\homework\\src\\main\\resources\\kontroldarbs\\";

    static String filename = "Java_advanced_tests";
    static String extension = ".txt";

    public static void main(String[] args) throws IOException {


        StringBuilder reverseFilename = new StringBuilder(filename).reverse().append(extension);
        BufferedReader in = new BufferedReader(new java.io.FileReader(PATH_TO_FILE + filename + extension));
        BufferedWriter out = new BufferedWriter(new java.io.FileWriter(PATH_TO_FILE + reverseFilename));

        String line;
        while ((line = in.readLine()) != null) {
            StringBuilder reverseLine = new StringBuilder(line).reverse();
            out.write(reverseLine + "\n");
        }

        in.close();
        out.close();

    }

}
