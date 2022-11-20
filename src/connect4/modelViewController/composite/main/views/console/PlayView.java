package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.PlayController;

public class PlayView {

    public void interact(PlayController playController) {
        do {
            new PlayMenu(playController).execute();
        } while (!playController.isConnect4());
        if (playController.isConnect4()) {
            new MessageView().writeln(Message.PLAYER_WIN, playController.getCurrentPlayer());
        } else {
            new MessageView().writeln(Message.GAME_FINISHED);
        }
        playController.nextState();
    }
}
