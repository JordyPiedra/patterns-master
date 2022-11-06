package connect4.modelViewController.withDoubleDispatching.views.graphics;

import connect4.modelViewController.withDoubleDispatching.controllers.PlayController;
import connect4.modelViewController.withDoubleDispatching.controllers.ResumeController;
import connect4.modelViewController.withDoubleDispatching.controllers.StartController;
import connect4.modelViewController.withDoubleDispatching.views.View;

public class GraphicsView implements View {

    public GraphicsView() {

    }

    @Override
    public void visit(StartController controller) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(PlayController controller) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean visit(ResumeController controller) {
        // TODO Auto-generated method stub
        return false;
    }

}
