package connect4.modelViewController.composite.views.console;

import connect4.modelViewController.composite.controllers.StartController;

public class StartView {

    public void interact(StartController controller) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().interact(controller);
        controller.nextState();
    }

}
