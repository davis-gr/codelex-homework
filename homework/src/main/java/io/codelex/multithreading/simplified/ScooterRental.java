package io.codelex.multithreading.simplified;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ScooterRental {

    /*
    Scooter rental has 5 scooters
    There are two processes:
        - the first one is a process that allows people to take scooters
        - the other process checks if there are any scooters available, if not it sets that
          no more scooters can be taken
     But it seems that program is not working - for people its possible to take more scooters than
     there are. Run the program and check what is happening.
     Fix the program so that it would work correctly.
    */

    private static AtomicInteger maxScootersAvailable = new AtomicInteger(5);
    private static boolean canTakeMoreScooters = true;

    public static void main(String[] args) {

        Runnable peopleTakingScooters = () -> {
            while (canTakeMoreScooters) {
                maxScootersAvailable.getAndDecrement();
                System.out.println("Person took a scooter!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable checkScooterAvailability = () -> {
            while (maxScootersAvailable.get() > 0) {
            }
            canTakeMoreScooters = false;
            System.out.println("No more scooters available!");
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(checkScooterAvailability);
        executor.execute(peopleTakingScooters);
        executor.shutdown();
    }

}
