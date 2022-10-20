package facade.views.console;

import facade.controllers.PlayController;
import facade.utils.Message;

public class PlayView extends InteractiveView<PlayController> {


    public PlayView(PlayController controller) {
        super(controller);
    }

    public void interact() {
        do {
            this.controller.nextPlayer();
            new PlayerView(this.controller).interact();
            new BoardView(this.controller).interact();
        } while (!this.controller.isConnect4() && !this.controller.isFinished());

        if (this.controller.isConnect4()) {
            Message.PLAYER_WIN.writeln(this.controller.getCurrentPlayer());
        } else {
            Message.GAME_FINISHED.writeln();
        }

    }
}
