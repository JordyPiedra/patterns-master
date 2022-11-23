package connect4.modelViewController.composite.main.models;

import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Coordinate;
import connect4.modelViewController.composite.main.types.Direction;
import connect4.modelViewController.composite.main.types.Error;

public class Game {

    private Board board;
    private Turn turn;

    int MIN_RESULT_SIZE = 4;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public void reset() {
        this.board.reset();
        this.turn.reset();
    }

    public void next() {
        this.turn.nextPlayer();
    }

    public int getCurrentPlayer() {
        return this.turn.getCurrentPlayer();
    }

    public Color getCurrentColor() {
        return this.turn.getActiveColor();
    }

    public void putToken(int column) {
        this.turn.putToken(column);
    }

    public boolean isFinished() {
        return this.turn.isAllTokensAdded();
    }

    public Board getBoard() {
        return board;
    }


    public boolean isConnect4() {
        boolean isWinnerLine = false;
        for (int i = 0; i < Direction.values().length && !isWinnerLine; i++) {
            isWinnerLine = tokensByDirection(Direction.values()[i]) >= MIN_RESULT_SIZE;
        }
        return isWinnerLine;
    }

    private int tokensByDirection(Direction direction) {
        return countTokens(direction.getCoordinate()) + countTokens(direction.inverted()) + 1;
    }

    private int countTokens(Coordinate coordinate) {
        int tokens = 0;
        Coordinate nextCoordinate = this.board.getLastToken().move(coordinate);
        while (nextCoordinate.isValidRange()
                && this.board.getCurrentColor().equals(this.board.getColor(nextCoordinate))) {
            tokens++;
            nextCoordinate = nextCoordinate.move(coordinate);
        }
        return tokens;
    }

    public Color getColor(Coordinate coordinate) {
        return this.board.getColor(coordinate);
    }

    public int getNextRow(int column) {
        return this.board.getNextRow(column);
    }

    public boolean isAllTokensAdded() {
        return this.turn.isAllTokensAdded();
    }

    public Error getPutTokenError(int column) {

        if (!this.board.isColumnValid(column)) {
            return Error.WRONG_COLUMN;
        }

        if (!this.board.isNextRowValid(column)) {
            return Error.FULL_COLUMN;
        }

        return Error.NULL;
    }

    Memento createMemento() {
        return new Memento(this.board, this.turn);
    }

    void setMemento(Memento memento) {
        this.board = memento.getBoard();
        this.turn = new Turn(this.board);
        this.turn.setActivePlayer(memento.getActivePlayer());
        for (Color color : Color.getAll()) {
            this.turn.setPlayerPutTokens(color, memento.getPlayerPutTokens(color));
        }
    }

}
