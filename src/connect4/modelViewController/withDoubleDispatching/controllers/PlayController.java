package connect4.modelViewController.withDoubleDispatching.controllers;

import connect4.modelViewController.withDoubleDispatching.models.Game;
import connect4.modelViewController.withDoubleDispatching.models.State;
import connect4.modelViewController.withDoubleDispatching.types.Error;

public class PlayController extends Controller {

    public PlayController(Game game, State state) {
        super(game, state);
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

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }


}
