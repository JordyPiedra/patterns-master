package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.PlayController;
import connect4.modelViewController.composite.main.controllers.ResumeController;
import connect4.modelViewController.composite.main.controllers.StartController;
import connect4.modelViewController.composite.main.views.View;

public class ConsoleView implements View {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void visit(StartController startController) {
        this.startView.interact(startController);

    }

    @Override
    public void visit(PlayController playController) {
        this.playView.interact(playController);

    }

    @Override
    public boolean visit(ResumeController resumeController) {
        return this.resumeView.interact(resumeController);

    }
}
