package connect4.modelViewController.composite.main.views.graphics;

import connect4.modelViewController.composite.main.controllers.PlayController;
import connect4.modelViewController.composite.main.controllers.ResumeController;
import connect4.modelViewController.composite.main.controllers.StartController;
import connect4.modelViewController.composite.main.views.View;

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
