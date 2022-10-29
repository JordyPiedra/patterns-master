package connect4.modelViewController.facade.controllers;

import connect4.modelViewController.facade.models.Game;
import connect4.modelViewController.facade.types.Error;

public class PlayController extends Controller {

    public PlayController(Game game) {
        super(game);
    }

    public int getCurrentPlayer() {
        return this.game.getCurrentPlayer();
    }

    public Integer getNextRow(int column) {
        return this.game.getNextRow(column);
    }

    public void putToken(int column) {
        this.game.putToken(column);
    }

    public void next() {
        this.game.next();
    }

    public boolean isConnect4() {
        return this.game.isConnect4();
    }

    public boolean isFinished() {
        return this.game.isFinished();
    }

    public boolean isAllTokensAdded() {
        return this.game.isAllTokensAdded();
    }

    public Error getPutTokenError(int column) {
        return this.game.getPutTokenError(column);
    }
}
