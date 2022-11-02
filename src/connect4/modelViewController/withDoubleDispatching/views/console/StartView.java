package connect4.modelViewController.withDoubleDispatching.views.console;

import connect4.modelViewController.withDoubleDispatching.controllers.StartController;

public class StartView {

    public void interact(StartController controller) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().interact(controller);
        controller.nextState();
    }

}
