package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Logic;

public class StartView extends InteractiveView {

    StartView(Logic logic) {
        super(logic);
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView(this.logic).interact();
    }

}
