package org.example;

public class Main {
    public static void main(String[] args) {
        MontyHallExperiment experiment = new MontyHallExperiment(1000);
        experiment.runExperiment();
        experiment.printStatistics();
    }
}
