package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.controllers.PlayController;

public class PlayView extends InteractiveView<PlayController> {

    public PlayView(PlayController controller) {
        super(controller);
    }

    public void interact() {
        do {
            new PlayerView(this.controller).interact();
            new BoardView(this.controller).interact();
        } while (!this.controller.isConnect4() && !this.controller.isFinished());

        if (this.controller.isConnect4()) {
            new MessageView().writeln(Message.PLAYER_WIN, this.controller.getCurrentPlayer());
        } else {
            new MessageView().writeln(Message.GAME_FINISHED);
        }

    }
}
