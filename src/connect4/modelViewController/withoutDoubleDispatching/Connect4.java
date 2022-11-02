package connect4.modelViewController.withoutDoubleDispatching;

import connect4.modelViewController.withoutDoubleDispatching.controllers.Logic;
import connect4.modelViewController.withoutDoubleDispatching.controllers.PlayController;
import connect4.modelViewController.withoutDoubleDispatching.controllers.ResumeController;
import connect4.modelViewController.withoutDoubleDispatching.controllers.StartController;
import connect4.modelViewController.withoutDoubleDispatching.views.View;

abstract class Connect4 {

    protected View view;
    protected Logic logic;

    public Connect4() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
        do {
            if (logic.getController() instanceof StartController) {
                this.view.start((StartController) logic.getController());
            } else {
                if (logic.getController() instanceof PlayController) {
                    this.view.play((PlayController) logic.getController());
                } else {
                    this.view.resume((ResumeController) logic.getController());
                }
            }
        } while (logic.getController() != null);
    }

}