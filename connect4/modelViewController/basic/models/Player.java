package connect4.modelViewController.basic.models;

import connect4.modelViewController.basic.types.Color;

public class Player {

    Color color;
    Board board;
    private int putTokens;

    public Player(Color color, Board board) {
        this.color = color;
        this.board = board;
    }

    void putToken(int column) {
        this.board.putToken(column, this.color);
        this.putTokens++;
    }

    public int getPutTokens() {
        return putTokens;
    }
}
