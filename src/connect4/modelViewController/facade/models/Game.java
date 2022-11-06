package connect4.modelViewController.facade.models;

import java.util.List;

import connect4.modelViewController.facade.types.Color;
import connect4.modelViewController.facade.types.Coordinate;
import connect4.modelViewController.facade.types.Direction;
import connect4.modelViewController.facade.types.Error;

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

    public void putToken(int column) {
        this.turn.putToken(column);
    }

    public boolean isFinished() {
        return this.turn.isAllTokensAdded();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isConnect4() {
        List<Direction[]> directions = Direction.getAllDirections();
        for (Direction[] direction : directions) {
            if (this.isDirectionValid(direction)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDirectionValid(Direction[] directions) {

        int totalTokens = 1;
        for (int i = 0; i < directions.length; i++) {
            totalTokens += countValidTokens(directions[i]);
        }
        return totalTokens >= MIN_RESULT_SIZE;
    }

    public int countValidTokens(Direction direction) {

        int tokens = 0;
        Coordinate nextCoordinate = direction.increment(this.board.getLastToken());
        while (nextCoordinate.isValid() && this.board.getCurrentColor().equals(this.board.getColor(nextCoordinate))) {
            tokens++;
            nextCoordinate = direction.increment(nextCoordinate);
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

}
