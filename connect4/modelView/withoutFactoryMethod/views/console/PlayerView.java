package connect4.modelView.withoutFactoryMethod.views.console;

import connect4.modelView.withoutFactoryMethod.models.Game;
import connect4.modelView.withoutFactoryMethod.utils.Console;
import connect4.modelView.withoutFactoryMethod.types.Error;

public class PlayerView extends InteractiveView {

    PlayerView(Game game) {
        super(game);
    }

    public void interact() {
        if (this.game.isAllTokensAdded()) {
            new MessageView().writeln(Message.GAME_FINISHED);
        } else {
            this.putToken();
        }
    }

    private void putToken() {
        new MessageView().writeln(Message.PLAYER_TURN, this.game.getCurrentPlayer());
        int column;
        Error error;
        do {
            column = Console.getInstance().readInt(Message.ENTER_COLUMN_TO_PUT.toString()) - 1;
            error = this.getPutTokenError(column);
        } while (!error.isNull());
        this.game.putToken(column);
        this.game.next();
    }

    private Error getPutTokenError(int column) {
        assert column > 0;

        Error error = this.game.getPutTokenError(column);
        new ErrorView().writeln(error);
        return error;
    }

}
