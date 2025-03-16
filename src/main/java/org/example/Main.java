package org.example;

import org.example.gameboard.GameBoard;

public class Main {

    private static final GameBoard gameBoard = new GameBoard(10, 10);

    public static void main(String[] args) {
        System.out.println("Welcome to the Test Sim City");

        gameBoard.printGameBoard();
    }


}