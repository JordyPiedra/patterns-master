package connect4.modelViewController.composite.views.console;

import connect4.modelViewController.composite.controllers.PlayController;
import connect4.modelViewController.composite.utils.Menu;

class PlayMenu extends Menu {

    PlayMenu(PlayController playController) {
        this.addCommand(new ActionCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
    }

}
