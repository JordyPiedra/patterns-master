package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.PlayController;
import connect4.modelViewController.facade.controllers.ResumeController;
import connect4.modelViewController.facade.controllers.StartController;
import connect4.modelViewController.facade.views.View;

public class ConsoleView extends View {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView(StartController startController, PlayController playController,
            ResumeController resumeController) {
        super(startController, playController, resumeController);
        this.startView = new StartView(startController);
        this.playView = new PlayView(playController);
        this.resumeView = new ResumeView(resumeController);
    }

    @Override
    public void start() {
        this.startView.interact();
    }

    @Override
    public void play() {
        this.playView.interact();
    }

    @Override
    public boolean resume() {
        return this.resumeView.interact();
    }

}
