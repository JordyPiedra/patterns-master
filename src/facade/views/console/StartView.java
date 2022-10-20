package facade.views.console;

import facade.controllers.StartController;
import facade.utils.Message;

public class StartView extends InteractiveView<StartController> {

    StartView(StartController controller) {
        super(controller);
    }

    public void interact() {
        Message.TITLE.writeln();
        new BoardView(this.controller).interact();
    }

}
