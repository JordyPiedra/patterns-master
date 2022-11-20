package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.PlayController;
import connect4.modelViewController.composite.main.utils.Menu;

class PlayMenu extends Menu {

    PlayMenu(PlayController playController) {
        this.addCommand(new ActionCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
    }

}
