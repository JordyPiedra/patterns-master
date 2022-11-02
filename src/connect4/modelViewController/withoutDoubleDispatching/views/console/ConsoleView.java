package connect4.modelViewController.withoutDoubleDispatching.views.console;

import connect4.modelViewController.withoutDoubleDispatching.controllers.PlayController;
import connect4.modelViewController.withoutDoubleDispatching.controllers.ResumeController;
import connect4.modelViewController.withoutDoubleDispatching.controllers.StartController;
import connect4.modelViewController.withoutDoubleDispatching.views.View;

public class ConsoleView implements View {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView() {        
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    public void start(StartController startController) {
        this.startView.interact(startController);
    }

    public void play(PlayController playController) {
        this.playView.interact(playController);
    }

    public boolean resume(ResumeController resumeController) {
        return this.resumeView.interact(resumeController);
    }
}
