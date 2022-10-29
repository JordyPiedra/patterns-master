package connect4.modelViewController.withoutDoubleDispatching.controllers;

import connect4.modelViewController.withoutDoubleDispatching.models.Game;
import connect4.modelViewController.withoutDoubleDispatching.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void reset() {
        this.game.reset();
        this.state.reset();
    }
}
