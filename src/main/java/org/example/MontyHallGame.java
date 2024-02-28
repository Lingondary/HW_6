package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class MontyHallGame {
    private int doorWithCar;
    private int chosenDoor;
    private int revealedDoor;
}

