package connect4.modelViewController.composite.tests.models;

import connect4.modelViewController.composite.main.models.Game;
import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Coordinate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBuilder {

    private List<Integer> columns;
    private Game game;

    public GameBuilder() {
        this.game = new Game();
        this.columns = new ArrayList<>();
    }

    public GameBuilder(Color color) {
        this.game = new Game();
        this.columns = new ArrayList<>();
        if (color != this.game.getCurrentColor()) {
            this.game.next();
        }
    }

    public GameBuilder initialTurn(Integer column) {
        if (column != this.game.getCurrentPlayer()) {
            this.game.next();
        }
        return this;
    }

    public GameBuilder initialTurn(Color color) {
        if (color != this.game.getCurrentColor()) {
            this.game.next();
        }
        return this;
    }

    public GameBuilder columns(Integer... columns) {
        this.columns = Arrays.asList(columns);
        return this;
    }

    public GameBuilder column(Integer column) {
        this.columns.add(column);
        return this;
    }

    public Game build() {
        for (Integer column : this.columns ) {
            this.game.putToken(column);
            this.game.next();
        }
        return this.game;
    }

    public GameBuilder full() {
        for (int i = 0; i < Coordinate.DIMENSION_COLUMN; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_ROW; j++) {
                this.columns.add(i);
            }
        }
        return this;
    }

}
