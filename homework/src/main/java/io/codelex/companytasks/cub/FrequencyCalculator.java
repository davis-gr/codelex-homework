package io.codelex.companytasks.cub;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCalculator {

    private static final String PATH_TO_FILE = "src\\main\\resources\\companytasks\\cub\\";

    private static final String FILENAME = "test_text.txt";

    private static Map<Character, Integer> frequencies = new TreeMap<>();

    public static void main(String[] args) {
        System.out.println(calculateFrequencies().toString());
    }

    static Map<Character, Integer> calculateFrequencies() {
        try {
            BufferedReader in = new BufferedReader(new java.io.FileReader(PATH_TO_FILE + FILENAME));

            String line;

            while ((line = in.readLine()) != null) {
                for (Character character : line.toLowerCase().replaceAll("[^a-z]", "").toCharArray()) {
                    frequencies.put(character, frequencies.get(character) == null ? 1 : frequencies.get(character) + 1);
                }
                // Below is a one-liner approach that also works instead of the forEach loop. But I think forEach is easier to understand and read.
                // CharBuffer.wrap(line.toLowerCase().replaceAll("[^a-z]", "").toCharArray()).chars().forEach(character -> frequencies.put((char) character, frequencies.get((char) character) == null ? 1 : frequencies.get((char) character) + 1));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return frequencies;
    }
}