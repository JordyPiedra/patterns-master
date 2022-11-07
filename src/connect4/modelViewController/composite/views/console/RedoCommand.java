package connect4.modelViewController.composite.views.console;

import connect4.modelViewController.composite.controllers.PlayController;

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