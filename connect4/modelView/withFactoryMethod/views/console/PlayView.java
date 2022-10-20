package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.utils.Message;

public class PlayView extends InteractiveView {
    public PlayView(Game game) {
        super(game);
    }

    public void interact() {
        do {
            new PlayerView(this.game).interact();
            this.game.next();
            new BoardView(this.game).interact();
        } while (!this.game.isConnect4() && !this.game.isFinished());

        if (this.game.isConnect4()) {
            Message.PLAYER_WIN.writeln(this.game.getCurrentPlayer());
        } else {
            Message.GAME_FINISHED.writeln();
        }

    }
}
