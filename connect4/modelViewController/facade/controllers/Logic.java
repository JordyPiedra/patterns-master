package connect4.modelViewController.facade.controllers;

import connect4.modelViewController.facade.models.Game;
import connect4.modelViewController.facade.types.Color;
import connect4.modelViewController.facade.types.Coordinate;
import connect4.modelViewController.facade.types.Error;

public class Logic {

    private Game game;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;

    public Logic() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
    }

    public int getDimensionRow() {
        return startController.getDimensionRow();
    }

    public int getDimensionColumn() {
        return startController.getDimensionColumn();
    }

    public Color getColor(Coordinate coordinate) {
        return startController.getColor(coordinate);
    }

    public boolean isAllTokensAdded() {
        return playController.isAllTokensAdded();
    }

    public int getCurrentPlayer() {
        return playController.getCurrentPlayer();
    }

    public void putToken(int column) {
        playController.putToken(column);
    }

    public void next() {
        playController.next();
    }

    public Error getPutTokenError(int column) {
        return playController.getPutTokenError(column);
    }

    public boolean isConnect4() {
        return playController.isConnect4();
    }

    public boolean isFinished() {
        return playController.isFinished();
    }

    public void reset() {
        resumeController.reset();
    }

}
