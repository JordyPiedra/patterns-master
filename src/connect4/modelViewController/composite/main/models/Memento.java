package connect4.modelViewController.composite.main.models;

import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Coordinate;

public class Memento {

    private int activePlayer;
    private char[] boardColors;

    Memento(Board board, Turn turn) {
        this.boardColors = board.toCharacterArray();
        this.activePlayer = turn.getCurrentPlayer();
    }

    Board getBoard() {
        Board board = new Board();
        int colorsCount = 0;
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                board.putToken(new Coordinate(i, j), Color.get(this.boardColors[colorsCount++]));
            }
        }
        return board;
    }

    int getActivePlayer() {
        return this.activePlayer;
    }

    int getPlayerPutTokens(Color color) {
        int playerPutTokens = 0;
        for (int i = 0; i < this.boardColors.length; i++) {
            if (Color.get(this.boardColors[i]) == color) {
                playerPutTokens++;
            }
        }
        return playerPutTokens;
    }

}
