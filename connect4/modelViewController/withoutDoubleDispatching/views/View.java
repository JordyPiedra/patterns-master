package connect4.modelViewController.withoutDoubleDispatching.views;

import connect4.modelViewController.withoutDoubleDispatching.controllers.PlayController;
import connect4.modelViewController.withoutDoubleDispatching.controllers.ResumeController;
import connect4.modelViewController.withoutDoubleDispatching.controllers.StartController;

public interface View {

    public void start(StartController startController);

    public void play(PlayController playController);

    public boolean resume(ResumeController resumeController);

}
