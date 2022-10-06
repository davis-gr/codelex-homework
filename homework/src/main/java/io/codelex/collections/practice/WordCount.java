package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> shakeSpear = Files.readAllLines(path, charset);

        int lines = 0;
        int words = 0;
        int chars = 0;

        for (String line : shakeSpear) {
            lines++;
            String[] wordArr = line.split("\\s+");
            words += wordArr.length;
            chars += line.length();
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Chars: " + chars);
    }
}
