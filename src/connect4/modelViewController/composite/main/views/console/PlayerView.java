package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.PlayController;
import connect4.modelViewController.composite.main.utils.Console;
import connect4.modelViewController.composite.main.types.Error;

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
