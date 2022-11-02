package connect4.modelViewController.basic.controllers;

import connect4.modelViewController.basic.models.Game;

public class ResumeController  extends Controller {

    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
