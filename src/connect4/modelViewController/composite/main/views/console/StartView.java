package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.StartController;

public class StartView {

    public void interact(StartController controller) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().interact(controller);
        controller.nextState();
    }

}
