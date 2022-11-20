package connect4.modelViewController.composite.main.models;

import connect4.modelViewController.composite.main.types.Color;

public class Player {

    private Color color;
    private Board board;
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

    public Color getColor() {
        return this.color;
    }

    public void set(int playerPutTokens) {
        this.putTokens = playerPutTokens;
    }
}
