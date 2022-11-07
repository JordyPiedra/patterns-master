package connect4.modelViewController.composite.views.console;

import connect4.modelViewController.composite.controllers.PlayController;
import connect4.modelViewController.composite.utils.Console;
import connect4.modelViewController.composite.types.Error;

public class PlayerView {
    PlayController controller;

    PlayerView(PlayController playController) {
        this.controller = playController;
    }

    public void interact() {
        if (this.controller.isAllTokensAdded()) {
            new MessageView().writeln(Message.GAME_FINISHED);
        } else {
            this.putToken();
        }
    }

    private void putToken() {
        new MessageView().writeln(Message.PLAYER_TURN, this.controller.getCurrentPlayer());
        int column;
        Error error;
        do {
            column = Console.getInstance().readInt(Message.ENTER_COLUMN_TO_PUT.toString()) - 1;
            error = getPutTokenError(column);
        } while (!error.isNull());
        this.controller.putToken(column);
    }

    private Error getPutTokenError(int column) {
        assert column > 0;

        Error error = this.controller.getPutTokenError(column);
        new ErrorView().writeln(error);
        return error;
    }

}
