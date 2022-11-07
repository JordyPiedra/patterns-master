package connect4.modelViewController.passiveView.controllers;

import connect4.modelViewController.passiveView.models.Game;
import connect4.modelViewController.passiveView.views.ViewFactory;

public class ResumeController extends Controller {

    public ResumeController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void reset() {
        this.game.reset();
    }

    public boolean control() {
        boolean isResumed = this.viewFactory.createResumeView().interact();
        if (isResumed) {
            this.game.reset();
        }
        return isResumed;
    }
}
