package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    public static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {

        // Actions done for test scenario according to the task:
        VideoStore.addVideo("The Matrix");
        VideoStore.addVideo("Godfather II");
        VideoStore.addVideo("Star Wars Episode IV: A New Hope");
        VideoStore.rateVideo("The Matrix", 9);
        VideoStore.rateVideo("The Matrix", 8);
        VideoStore.rateVideo("The Matrix", 10);
        VideoStore.rateVideo("The Matrix", 7);
        VideoStore.rateVideo("Godfather II", 6);
        VideoStore.rateVideo("Godfather II", 3);
        VideoStore.rateVideo("Godfather II", 9);
        VideoStore.rateVideo("Godfather II", 5);
        VideoStore.rateVideo("Star Wars Episode IV: A New Hope",10);
        VideoStore.rateVideo("Star Wars Episode IV: A New Hope",8);
        VideoStore.rateVideo("Star Wars Episode IV: A New Hope",7);
        VideoStore.rateVideo("Star Wars Episode IV: A New Hope",5);
        VideoStore.checkOutVideo("The Matrix");
        VideoStore.checkOutVideo("Godfather II");
        VideoStore.checkOutVideo("Star Wars Episode IV: A New Hope");
        VideoStore.returnVideo("The Matrix");
        VideoStore.returnVideo("Godfather II");
        VideoStore.returnVideo("Star Wars Episode IV: A New Hope");
        VideoStore.checkOutVideo("Godfather II");
        listVideos();


        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to list all videos");
            System.out.println("Choose 5 to rate a video");
            System.out.println("Choose 6 to check if a video is available");

            int n = keyboard.nextInt();


            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                case 4 -> listVideos();
                case 5 -> rateVideo(keyboard);
                case 6 -> isAvailable(keyboard);
                default -> {
                }
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        if (VideoStore.allVideos.length == COUNT_OF_MOVIES) {
            System.out.println("Video database full, sorry!");
            System.out.println();
        }
        else {
            for (int i = 0; i < COUNT_OF_MOVIES; i++) {
                System.out.println("Enter movie name");
                scanner.nextLine();
                String movieName = scanner.nextLine();
                VideoStore.addVideo(movieName);
                System.out.println("Enter rating");
                int rating = scanner.nextInt();
                VideoStore.rateVideo(movieName, rating);
            }
        }
    }

    private static void rentVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter movie name to rent: ");
        String movieName = scanner.nextLine();
        System.out.println(VideoStore.checkOutVideo(movieName));
    }

    private static void returnVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter movie name to return: ");
        String movieName = scanner.nextLine();
        System.out.println(VideoStore.returnVideo(movieName));
    }

    private static void listVideos() {
        VideoStore.listVideos();
    }

    private static void rateVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter movie name to rate: ");
        String movieName = scanner.nextLine();
        System.out.println("Enter rating: ");
        int rating = scanner.nextInt();
        System.out.println(VideoStore.rateVideo(movieName, rating));
    }
    private static void isAvailable(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter movie name to check: ");
        String movieName = scanner.nextLine();
        System.out.println(VideoStore.isAvailable(movieName));
    }

}
