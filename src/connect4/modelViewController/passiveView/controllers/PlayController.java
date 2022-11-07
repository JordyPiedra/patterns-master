package connect4.modelViewController.passiveView.controllers;

import connect4.modelViewController.passiveView.views.console.Message;
import connect4.modelViewController.passiveView.models.Game;
import connect4.modelViewController.passiveView.types.Error;
import connect4.modelViewController.passiveView.views.ViewFactory;

public class PlayController extends Controller {

    public PlayController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void control() {
        do {
            this.putToken();
            this.writeBoard();
        } while (!this.game.isConnect4() && !this.game.isFinished());

        if (this.game.isConnect4()) {
            this.viewFactory.createPlayerView().writeWinner(this.game.getCurrentColor());
        } else {
            this.viewFactory.createMessageView().write(Message.GAME_FINISHED);
        }
    }

    private void putToken() {
        this.viewFactory.createMessageView().write(Message.PLAYER_TURN, this.game.getCurrentPlayer());
        int column;
        Error error;
        do {
            column = this.viewFactory.createColumnView().read(Message.ENTER_COLUMN_TO_PUT.toString());
            error = this.getPutTokenError(column);
        } while (!error.isNull());
        this.game.putToken(column);
        this.game.next();
    }

    private Error getPutTokenError(int column) {
        assert column > 0;

        Error error = this.game.getPutTokenError(column);
        this.viewFactory.createErrorView().write(error);
        return error;
    }
}
