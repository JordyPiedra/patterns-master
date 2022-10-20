package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.StartController;
import connect4.modelViewController.facade.utils.Message;

public class StartView extends InteractiveView<StartController> {

    StartView(StartController controller) {
        super(controller);
    }

    public void interact() {
        Message.TITLE.writeln();
        new BoardView(this.controller).interact();
    }

}
