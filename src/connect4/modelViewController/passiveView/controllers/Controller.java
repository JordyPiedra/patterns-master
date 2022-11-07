package connect4.modelViewController.passiveView.controllers;

import connect4.modelViewController.passiveView.models.Game;
import connect4.modelViewController.passiveView.types.Coordinate;
import connect4.modelViewController.passiveView.views.BoardView;
import connect4.modelViewController.passiveView.views.ViewFactory;

public abstract class Controller {

    protected Game game;
    protected ViewFactory viewFactory;

    public Controller(Game game, ViewFactory viewFactory) {
        this.game = game;
        this.viewFactory = viewFactory;
    }

    void writeBoard() {
        BoardView boardView = this.viewFactory.createBoardView();
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                boardView.set(this.game.getColor(new Coordinate(i, j)));
            }
        }
        boardView.write();
    }

}
