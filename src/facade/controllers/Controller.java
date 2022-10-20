package facade.controllers;


import facade.models.Game;
import facade.types.Color;
import facade.types.Coordinate;

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
