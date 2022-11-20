package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.PlayController;

public class RedoCommand extends Command {

    RedoCommand(PlayController playController) {
        super(Message.REDO_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        this.playController.redo();
        super.execute();
    }

    @Override
    public boolean isActive() {
        return this.playController.redoable();
    }

}