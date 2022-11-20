package connect4.modelViewController.composite.main.utils;

public abstract class Command {

	protected String title;

	protected Command(String title) {
		this.title = title;
	}

	public abstract void execute();

	public abstract boolean isActive();

	public String getTitle() {
		return this.title;
	}

}
