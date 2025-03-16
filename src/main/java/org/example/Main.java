package org.example;

import org.example.control.GameControl;
import org.example.control.GameControlImpl;

public class Main {
    private static final GameControl gameControl = new GameControlImpl();

    public static void main(String[] args) {
        System.out.println("Welcome to the Test Sim City");

        gameControl.startGame(10, 10);
        gameControl.printGameBoard();

    }


}