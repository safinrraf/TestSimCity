package org.example.control;

import org.example.city.Building;
import org.example.city.CityCell;
import org.example.city.EmptyPlace;
import org.example.gameboard.GameBoard;

import java.math.BigDecimal;

public class GameControlImpl implements GameControl {

    private GameBoard gameBoard;
    private GameStatus gameStatus;

    public GameControlImpl() {
        this.gameStatus = GameStatus.NEW;
    }

    @Override
    public void addBuilding(int row, int col, Building building) {
        if(!isGameStarted()) {
            System.out.println("Game is not started");
            return;
        }

        this.gameBoard.setCell(row, col, new CityCell(0, 0, BigDecimal.valueOf(123.43), building));
    }

    @Override
    public void startGame(int rowCount, int colCount) {
        this.gameBoard = new GameBoard(rowCount, colCount);

        for(int i = 0; i < this.gameBoard.getRowCount(); i++) {
            for(int j = 0; j < this.gameBoard.getColCount(); j++) {
                this.gameBoard.setCell(i, j, new CityCell(0, 0, BigDecimal.valueOf(123.43), new EmptyPlace()));
            }
        }
        this.gameStatus = GameStatus.STARTED;
    }

    @Override
    public void printGameBoard() {
        if(!isGameStarted()) {
            System.out.println("Game is not started");
            return;
        }

        int col = this.gameBoard.getColCount();
        int row = this.gameBoard.getRowCount();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                CityCell cityCell = this.gameBoard.getCell(i, j);
                if(cityCell.getBuilding() == null) {
                    System.out.print("[ * ]");
                } else {
                    System.out.printf("[ %s ]", cityCell.getBuilding().getEmoji());
                }
            }
            System.out.println(" ");
        }
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    private boolean isGameStarted() {
        return this.gameStatus == GameStatus.STARTED;
    }
}
