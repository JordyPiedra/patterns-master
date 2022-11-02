package connect4.modelViewController.withDoubleDispatching.views.console;

import connect4.modelViewController.withDoubleDispatching.controllers.PlayController;
import connect4.modelViewController.withDoubleDispatching.controllers.ResumeController;
import connect4.modelViewController.withDoubleDispatching.controllers.StartController;
import connect4.modelViewController.withDoubleDispatching.views.View;

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
    public void accept(StartController controller) {
        this.startView.interact(controller);

    }

    @Override
    public void accept(PlayController controller) {
        this.playView.interact(controller);

    }

    @Override
    public boolean accept(ResumeController controller) {
        return this.resumeView.interact(controller);

    }
}
