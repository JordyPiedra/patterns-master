package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Logic;
import connect4.modelViewController.facade.utils.Console;
import connect4.modelViewController.facade.types.Error;

public class PlayerView extends InteractiveView {

    PlayerView(Logic logic) {
        super(logic);
    }

    public void interact() {
        if (this.logic.isAllTokensAdded()) {
            new MessageView().writeln(Message.GAME_FINISHED);
        } else {
            this.putToken();
        }
    }

    private void putToken() {
        new MessageView().writeln(Message.PLAYER_TURN, this.logic.getCurrentPlayer());
        int column;
        Error error;
        do {
            column = Console.getInstance().readInt(Message.ENTER_COLUMN_TO_PUT.toString()) - 1;
            error = this.getPutTokenError(column);
        } while (!error.isNull());
        this.logic.putToken(column);
        this.logic.next();
    }

    private Error getPutTokenError(int column) {
        assert column > 0;

        Error error = this.logic.getPutTokenError(column);
        new ErrorView().writeln(error);
        return error;
    }

}
