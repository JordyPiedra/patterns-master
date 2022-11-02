package connect4.modelView.withFactoryMethod.models;

import connect4.modelView.withFactoryMethod.types.Color;

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

    public boolean isAllTokensAdded() {
        return this.putTokens == (Board.DIMENSION_COLUMN * Board.DIMENSION_ROW) / 2;
    }
}
