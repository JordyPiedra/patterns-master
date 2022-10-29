package connect4.modelViewController.withoutDoubleDispatching.views.console;

import connect4.modelViewController.withoutDoubleDispatching.controllers.PlayController;

public class PlayView {

    public void interact(PlayController controller) {
        do {
            new PlayerView().interact(controller);            
            new BoardView().interact(controller);
        } while (!controller.isConnect4() && !controller.isFinished());

        if (controller.isConnect4()) {
            new MessageView().writeln(Message.PLAYER_WIN, controller.getCurrentPlayer());
        } else {
            new MessageView().writeln(Message.GAME_FINISHED);
        }
        controller.nextState();
    }
}
