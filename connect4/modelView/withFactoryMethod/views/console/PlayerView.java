package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.utils.Console;
import connect4.modelView.withFactoryMethod.utils.Message;

public class PlayerView extends InteractiveView {

    PlayerView(Game game) {
        super(game);
    }

    public void interact() {
        Message.PLAYER_TURN.writeln(this.game.getCurrentPlayer());
        int column;
        do {
            column = Console.getInstance().readInt(Message.ENTER_COLUMN_TO_PUT.toString()) - 1;
        } while (this.game.getNextRow(column) == null);
        this.game.putToken(column);
    }

}
