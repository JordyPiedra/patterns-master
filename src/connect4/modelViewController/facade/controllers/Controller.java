package connect4.modelViewController.facade.controllers;

import connect4.modelViewController.facade.models.Game;
import connect4.modelViewController.facade.types.Color;
import connect4.modelViewController.facade.types.Coordinate;

public abstract class Controller {

    protected Game game;

    public Controller(Game game) {
        this.game = game;
    }

    public Color getColor(Coordinate coordinate) {
        return this.game.getColor(coordinate);
    }

    public Integer getDimensionRow() {
        return this.game.getDimensionRow();
    }

    public Integer getDimensionColumn() {
        return this.game.getDimensionColumn();
    }
}
