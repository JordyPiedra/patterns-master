package connect4.modelViewController.withDoubleDispatching.controllers;

import connect4.modelViewController.withDoubleDispatching.models.Game;
import connect4.modelViewController.withDoubleDispatching.models.State;
import connect4.modelViewController.withDoubleDispatching.types.Color;
import connect4.modelViewController.withDoubleDispatching.types.Coordinate;

public abstract class Controller {

    protected Game game;
    protected State state;

    public Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void nextState() {
        this.state.next();
    }

    public Color getColor(Coordinate coordinate) {
        return this.game.getColor(coordinate);
    }

    public int getDimensionRow() {
        return this.game.getDimensionRow();
    }

    public int getDimensionColumn() {
        return this.game.getDimensionColumn();
    }

    public abstract void accept(ControllersVisitor controllersVisitor);
}
