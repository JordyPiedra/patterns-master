package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.PlayController;

public abstract class Command extends connect4.modelViewController.composite.main.utils.Command {
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
