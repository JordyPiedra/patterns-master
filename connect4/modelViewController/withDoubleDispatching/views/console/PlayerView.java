package connect4.modelViewController.withDoubleDispatching.views.console;

import connect4.modelViewController.withDoubleDispatching.controllers.PlayController;
import connect4.modelViewController.withDoubleDispatching.types.Error;
import connect4.modelViewController.withDoubleDispatching.utils.Console;

public class PlayerView {

    PlayController controller;

    public void interact(PlayController controller) {
        this.controller = controller;
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
        this.controller.next();
    }

    private Error getPutTokenError(int column) {
        assert column > 0;

        Error error = this.controller.getPutTokenError(column);
        new ErrorView().writeln(error);
        return error;
    }

}
