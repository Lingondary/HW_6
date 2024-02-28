package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameResult {
    private int doorWithCar;
    private int chosenDoor;
    private boolean win;
}