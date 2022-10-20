package facade.views;

import facade.controllers.PlayController;
import facade.controllers.ResumeController;
import facade.controllers.StartController;

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
