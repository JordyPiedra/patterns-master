package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Game;

public class PlayView extends InteractiveView {
    public PlayView(Game game) {
        super(game);
    }

    public void interact() {
        do {
            new PlayerView(this.game).interact();
            new BoardView(this.game).interact();
        } while (!this.game.isConnect4() && !this.game.isFinished());

        if (this.game.isConnect4()) {
            new MessageView().writeln(Message.PLAYER_WIN, this.game.getCurrentPlayer());
        } else {
            new MessageView().writeln(Message.GAME_FINISHED);
        }

    }
}
