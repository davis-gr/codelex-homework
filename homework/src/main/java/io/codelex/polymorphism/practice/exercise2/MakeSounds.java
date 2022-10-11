package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        Firework fw1 = new Firework();
        Parrot salvatore = new Parrot();
        Firework fw3 = new Firework();
        Radio latvijasRadioZivis = new Radio();
        Parrot giordano = new Parrot();
        Radio bbc = new Radio();
        Parrot albert = new Parrot();
        Radio videoKilledTheRadioStar = new Radio();
        Firework fw2 = new Firework();

        List<Sound> allSounds = new ArrayList<>();

        allSounds.add(fw1);
        allSounds.add(salvatore);
        allSounds.add(fw3);
        allSounds.add(latvijasRadioZivis);
        allSounds.add(giordano);
        allSounds.add(bbc);
        allSounds.add(albert);
        allSounds.add(videoKilledTheRadioStar);
        allSounds.add(fw2);

        for (Sound sound : allSounds) {
            sound.playSound();
        }

    }
}
