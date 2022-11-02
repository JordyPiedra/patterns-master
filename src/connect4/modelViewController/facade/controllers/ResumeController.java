package connect4.modelViewController.facade.controllers;

import connect4.modelViewController.facade.models.Game;

public class ResumeController  extends Controller {

    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
