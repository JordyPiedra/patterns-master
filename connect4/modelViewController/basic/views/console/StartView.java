package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.controllers.StartController;
import connect4.modelViewController.basic.utils.Message;

public class StartView extends InteractiveView<StartController> {

    StartView(StartController controller) {
        super(controller);
    }

    public void interact() {
        Message.TITLE.writeln();
        new BoardView(this.controller).interact();
    }

}
