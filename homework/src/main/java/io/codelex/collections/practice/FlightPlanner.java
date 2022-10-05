package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws URISyntaxException, IOException {

        System.out.println("What would you like to do:");
        System.out.println("To display list of the cities press 1:");
        System.out.println("To exit program press #");
        Scanner in = new Scanner(System.in);
        String originAirport = "";
        String nextAirport = "";
        String currentAirport = "";
        StringBuilder route = new StringBuilder();
        Map<String, List<String>> combinations = parseFlightFile();

        String choice = in.nextLine();
        if (choice.equals("#")) {
            System.exit(69);
        }
        if (choice.equals("1")) {

            System.out.println("All departure airports: ");
            printAllDepartures(combinations);
            System.out.println("Choose your departure airport (type in the name): ");
            originAirport = in.nextLine();
            currentAirport = originAirport;
            route.append(originAirport);
        }
        while (!originAirport.equals(nextAirport)) {
            System.out.println("Possible destinations from " + currentAirport + ": ");
            getPossibleDestinations(combinations, currentAirport);
            System.out.println("Choose your next destination: ");
            nextAirport = in.nextLine();
            route.append(" -> ").append(nextAirport);
            currentAirport = nextAirport;
        }

        System.out.println("Your route is: " + route);


    }


    private static Map<String, List<String>> parseFlightFile() throws URISyntaxException, IOException {

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flights = Files.readAllLines(path, charset);

        Map<String, List<String>> combinations = new HashMap<>();

        for (String flight : flights) {
            String[] oneFlight = flight.split("->");
            List<String> destinations = new ArrayList<>();
            String from = oneFlight[0].trim();
            String to = oneFlight[1].trim();
            if (combinations.containsKey(from)) {
                destinations = combinations.get(from);
                destinations.add(to);
            } else {
                combinations.put(from, destinations);
                destinations.add(to);
            }
        }
        return combinations;
    }

    private static void getPossibleDestinations(Map<String, List<String>> combinations, String airport) throws URISyntaxException, IOException {

        for (String key : combinations.keySet()) {
            if (key.equals(airport)) {
                for (String value : combinations.get(key)) {
                    System.out.println("- " + value);
                }
            }
        }

    }

    private static void printAllDepartures(Map<String, List<String>> combinations) throws URISyntaxException, IOException {
        for (String key : combinations.keySet()) {
            System.out.println("- " + key);
        }
    }

}
