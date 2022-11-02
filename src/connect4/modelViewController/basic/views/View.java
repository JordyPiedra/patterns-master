package connect4.modelViewController.basic.views;

import connect4.modelViewController.basic.controllers.PlayController;
import connect4.modelViewController.basic.controllers.ResumeController;
import connect4.modelViewController.basic.controllers.StartController;

public abstract class View {

    protected StartController startController;
    protected PlayController playController;
    protected ResumeController resumeController;

    public View(StartController startController, PlayController playController, ResumeController resumeController) {
        this.startController = startController;
        this.playController = playController;
        this.resumeController = resumeController;
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();

}
