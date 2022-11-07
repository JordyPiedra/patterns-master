package connect4.modelViewController.composite.views.console;

import connect4.modelViewController.composite.controllers.PlayController;

public class UndoCommand extends Command {
    UndoCommand(PlayController playController) {
        super(Message.UNDO_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        this.playController.undo();
        super.execute();
    }

    @Override
    public boolean isActive() {
        return this.playController.undoable();
    }

}
