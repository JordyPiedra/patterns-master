package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Logic;

public class PlayView extends InteractiveView {

    public PlayView(Logic logic) {
        super(logic);
    }

    public void interact() {
        do {
            new PlayerView(this.logic).interact();
            new BoardView(this.logic).interact();
        } while (!this.logic.isConnect4() && !this.logic.isFinished());

        if (this.logic.isConnect4()) {
            new MessageView().writeln(Message.PLAYER_WIN, this.logic.getCurrentPlayer());
        } else {
            new MessageView().writeln(Message.GAME_FINISHED);
        }

    }
}
