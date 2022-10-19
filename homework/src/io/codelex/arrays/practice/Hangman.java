package io.codelex.arrays.practice;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private static final String[] wordsList = {"abruptly", "absurd", "abyss", "affix", "askew", "avenue", "awkward", "axiom", "azure", "bagpipes", "bandwagon", "banjo", "bayou",
            "beekeeper", "bikini", "blitz", "blizzard", "boggle", "bookworm", "boxcar", "boxful", "buckaroo", "buffalo", "buffoon", "buxom", "buzzard", "buzzing", "buzzwords",
            "caliph", "cobweb", "cockiness", "croquet", "crypt", "curacao", "cycle", "daiquiri", "dirndl", "disavow", "dizzying", "duplex", "dwarves", "embezzle", "equip", "espionage",
            "euouae", "exodus", "faking", "fishhook", "fixable", "fjord", "flapjack", "flopping", "fluffiness", "flyby", "foxglove", "frazzled", "frizzled", "fuchsia", "funny", "gabby",
            "galaxy", "galvanize", "gazebo", "giaour", "gizmo", "glowworm", "glyph", "gnarly", "gnostic", "gossip", "grogginess", "haiku", "haphazard", "hyphen", "iatrogenic", "icebox", "injury",
            "ivory", "ivy", "jackpot", "jaundice", "jawbreaker", "jaywalk", "jazziest", "jazzy", "jelly", "jigsaw", "jinx", "jiujitsu", "jockey", "jogging", "joking", "jovial", "joyful", "juicy", "jukebox",
            "jumbo", "kayak", "kazoo", "keyhole", "khaki", "kilobyte", "kiosk", "kitsch", "kiwifruit", "klutz", "knapsack", "larynx", "lengths", "lucky", "luxury", "lymph", "marquis", "matrix", "megahertz", "microwave",
            "mnemonic", "mystify", "naphtha", "nightclub", "nowadays", "numbskull", "nymph", "onyx", "ovary", "oxidize", "oxygen", "pajama", "peekaboo", "phlegm", "pixel", "pizazz", "pneumonia", "polka", "pshaw", "psyche", "puppy",
            "puzzling", "quartz", "queue", "quips", "quixotic", "quiz", "quizzes", "quorum", "razzmatazz", "rhubarb", "rhythm", "rickshaw", "schnapps", "scratch", "shiv", "snazzy", "sphinx", "spritz", "squawk", "staff", "strength", "strengths",
            "stretch", "stronghold", "stymied", "subway", "swivel", "syndrome", "thriftless", "thumbscrew", "topaz", "transcript", "transgress", "transplant", "triphthong", "twelfth", "twelfths", "unknown", "unworthy", "unzip", "uptown",
            "vaporize", "vixen", "vodka", "voodoo", "vortex", "voyeurism", "walkway", "waltz", "wave", "wavy", "waxy", "wellspring", "wheezy", "whiskey", "whizzing", "whomever", "wimpy", "witchcraft", "wizard", "woozy", "wristwatch",
            "wyvern", "xylophone", "yachtsman", "yippee", "yoked", "youthful", "yummy", "zephyr", "zigzag", "zigzagging", "zilch", "zipper", "zodiac", "zombie"};

    private static final int MAX_TURNS = 7;

    public static void main(String[] args) {

        System.out.println(hangman());

    }

    private static int random() {
        Random r = new Random();
        int low = 0;
        int high = 201;
        return r.nextInt(high - low) + low;
    }

    private static String hangman() {
        String[] word = wordsList[random()].split("");
        System.out.println("WELCOME to HANGMAN where you'll be HANGED if you are bad at guessing words!");
        int wrongGuesses = 0;
        String[] answerArr = new String[word.length];
        Arrays.fill(answerArr, "_");
        StringBuilder misses = new StringBuilder();
        int remainingLetters = word.length;
        while (wrongGuesses < MAX_TURNS) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Word: " + String.join(" ", answerArr));
            System.out.println("Misses: " + misses);
            Scanner input = new Scanner(System.in);
            String guess = "";
            boolean goodGuess = false;
            do {
                System.out.print("Guess: ");
                guess = input.nextLine().toLowerCase();
            }
            while (guess.length() > 1);
            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(guess)) {
                    answerArr[i] = guess;
                    remainingLetters--;
                    goodGuess = true;
                }
            }
            if (!goodGuess) {
                wrongGuesses++;
                misses.append(guess);
            }
            if (remainingLetters == 0) {
                return "You won! The word was " + String.join("", word);
            }
        }
        return "You've been hanged! RIP. The word was " + String.join("", word);
    }
}