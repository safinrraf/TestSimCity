package org.example.gameboard;

import org.example.city.Building;
import org.example.city.CityCell;

public class GameBoard {
    private final int rowCount;
    private final int colCount;
    private final CityCell[][] gameBoard;

    public GameBoard(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.gameBoard = new CityCell[this.rowCount][this.colCount];
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public CityCell getCell(int row, int count) {
        return this.gameBoard[row][count];
    }

    public void setCell(int row, int col, CityCell cityCell) {
        this.gameBoard[row][col] = cityCell;
    }
}
