package connect4.modelViewController.withDoubleDispatching.controllers;

import connect4.modelViewController.withDoubleDispatching.models.Game;
import connect4.modelViewController.withDoubleDispatching.models.State;

public class StartController extends Controller {

    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.accept(this);
        
    }


}
