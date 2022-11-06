package connect4.modelViewController.withoutDoubleDispatching.controllers;

import connect4.modelViewController.withoutDoubleDispatching.models.Game;
import connect4.modelViewController.withoutDoubleDispatching.models.State;
import connect4.modelViewController.withoutDoubleDispatching.types.Color;
import connect4.modelViewController.withoutDoubleDispatching.types.Coordinate;

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

}
