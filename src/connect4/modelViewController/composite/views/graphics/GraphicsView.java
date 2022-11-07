package connect4.modelViewController.composite.views.graphics;

import connect4.modelViewController.composite.controllers.PlayController;
import connect4.modelViewController.composite.controllers.ResumeController;
import connect4.modelViewController.composite.controllers.StartController;
import connect4.modelViewController.composite.views.View;

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
