package connect4.modelViewController.withoutDoubleDispatching.views.console;

import connect4.modelViewController.withoutDoubleDispatching.controllers.StartController;

public class StartView {

    public void interact(StartController controller) {
        new MessageView().writeln(Message.TITLE);
        new BoardView().interact(controller);
        controller.nextState();
    }

}
