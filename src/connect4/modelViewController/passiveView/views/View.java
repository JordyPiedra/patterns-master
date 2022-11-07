package connect4.modelViewController.passiveView.views;

import connect4.modelViewController.passiveView.controllers.PlayController;
import connect4.modelViewController.passiveView.controllers.ResumeController;
import connect4.modelViewController.passiveView.controllers.StartController;

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
