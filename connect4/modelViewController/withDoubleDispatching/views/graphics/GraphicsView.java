package connect4.modelViewController.withDoubleDispatching.views.graphics;

import connect4.modelViewController.withDoubleDispatching.controllers.PlayController;
import connect4.modelViewController.withDoubleDispatching.controllers.ResumeController;
import connect4.modelViewController.withDoubleDispatching.controllers.StartController;
import connect4.modelViewController.withDoubleDispatching.views.View;

public class GraphicsView implements View {

    public GraphicsView() {

    }

    @Override
    public void accept(StartController controller) {
        // TODO Auto-generated method stub

    }

    @Override
    public void accept(PlayController controller) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean accept(ResumeController controller) {
        // TODO Auto-generated method stub
        return false;
    }

}
