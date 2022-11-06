package connect4.modelViewController.basic.controllers;

import connect4.modelViewController.basic.models.Game;
import connect4.modelViewController.basic.types.Color;
import connect4.modelViewController.basic.types.Coordinate;

public abstract class Controller {

    protected Game game;

    public Controller(Game game) {
        this.game = game;
    }

    public Color getColor(Coordinate coordinate) {
        return this.game.getColor(coordinate);
    }

}
