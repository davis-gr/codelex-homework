package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        int[] scoresArray = Arrays.stream(scores.split(" ")).mapToInt(Integer::parseInt).toArray();

        printBaskets(createBaskets(scoresArray));

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static Map<Integer, StringBuilder> createBaskets(int[] scoresArray) {

        Map<Integer, StringBuilder> scoresByBaskets = new HashMap<>();

        for (int i = 0; i <= 10; i++) {
            scoresByBaskets.put(i, new StringBuilder(""));
        }

        for (int score : scoresArray) {
            int scoreBasket = (score - score % 10) / 10;
            StringBuilder stars;
            if (scoresByBaskets.containsKey(scoreBasket)) {
                stars = scoresByBaskets.get(scoreBasket);
                stars.append("*");
            }
        }

        return scoresByBaskets;
    }

    private static void printBaskets(Map<Integer, StringBuilder> scoresByBaskets) {
        for (Integer key : scoresByBaskets.keySet()) {
            if (key < 10) {
                System.out.println(key + "0-" + key + "9: " + scoresByBaskets.get(key).toString());
            } else {
                System.out.println("  " + key + "0: " + scoresByBaskets.get(key).toString());
            }
        }
    }

}
