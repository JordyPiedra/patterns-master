package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.PlayController;

public class ActionCommand extends Command {

    ActionCommand(PlayController playController) {
        super(Message.ACTION_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        new PlayerView(this.playController).interact(); 
        this.playController.next();       
        super.execute();
    }

    @Override
    public boolean isActive() {
        return true;
    }

}