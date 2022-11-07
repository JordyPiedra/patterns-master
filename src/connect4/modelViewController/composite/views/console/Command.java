package connect4.modelViewController.composite.views.console;

import connect4.modelViewController.composite.controllers.PlayController;

public abstract class Command extends connect4.modelViewController.composite.utils.Command {
	protected PlayController playController;

	protected Command(String title, PlayController playController) {
		super(title);
		this.playController = playController;
	}

	@Override
	public void execute() {
		new BoardView().interact(this.playController);
	}
}
