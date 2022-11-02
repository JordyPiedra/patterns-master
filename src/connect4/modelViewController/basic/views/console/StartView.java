package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.controllers.StartController;

public class StartView extends InteractiveView<StartController> {

    StartView(StartController controller) {
        super(controller);
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView(this.controller).interact();
    }

}
