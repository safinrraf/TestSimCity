package org.example.control;

import org.example.city.Building;

public interface GameControl {

    void addBuilding(int row, int col, Building building);

    void startGame(int rowCount, int colCount);

    void printGameBoard();

    GameStatus getGameStatus();
}
