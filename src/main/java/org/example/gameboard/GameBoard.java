package org.example.gameboard;

import org.example.city.CityCell;
import org.example.city.EmptyPlace;

import java.math.BigDecimal;

public class GameBoard {
    private final int rowCount;
    private final int colCount;
    private final CityCell[][] gameBoard;

    public GameBoard(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.gameBoard = new CityCell[this.rowCount][this.colCount];

        initGameBoard();
    }

    private void initGameBoard() {
        for(int i = 0; i < this.rowCount; i++) {
            for(int j = 0; j < this.colCount; j++) {
                gameBoard[i][j] = new CityCell(0, 0, BigDecimal.valueOf(123.43), new EmptyPlace());
            }
        }
    }

    public void printGameBoard() {
        for(int i = 0; i < this.rowCount; i++) {
            for(int j = 0; j < this.colCount; j++) {
                if(gameBoard[i][j].getBuilding() == null) {
                    System.out.print("[ * ]");
                } else {
                    System.out.printf("[ %s ]", gameBoard[i][j].getBuilding().getEmoji());
                }
            }
            System.out.println(" ");
        }
    }
}
