package org.example;

import org.apache.commons.math3.random.RandomDataGenerator;
import java.util.ArrayList;
import java.util.List;

public class MontyHallExperiment {
    private int numGames;
    private List<GameResult> results;

    public MontyHallExperiment(int numGames) {
        this.numGames = numGames;
        this.results = new ArrayList<>();
    }

    public void runExperiment() {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        for (int i = 0; i < numGames; i++) {

            int doorWithCar = randomDataGenerator.nextInt(1, 3);
            int chosenDoor = randomDataGenerator.nextInt(1, 3);
            int revealedDoor = revealDoor(doorWithCar, chosenDoor);

            boolean win = (chosenDoor == doorWithCar);

            results.add(new GameResult(doorWithCar, chosenDoor, win));
        }
    }

    private int revealDoor(int doorWithCar, int chosenDoor) {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        int revealedDoor;
        do {
            revealedDoor = randomDataGenerator.nextInt(1, 3);
        } while (revealedDoor == doorWithCar || revealedDoor == chosenDoor);
        return revealedDoor;
    }

    public void printStatistics() {
        System.out.println("Total games: " + numGames);
        int wins = 0;
        for (GameResult result : results) {
            if (result.isWin()) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (numGames - wins));
    }
}
