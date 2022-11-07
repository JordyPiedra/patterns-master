package connect4.modelViewController.passiveView.controllers;

import connect4.modelViewController.passiveView.models.Game;
import connect4.modelViewController.passiveView.views.ViewFactory;

public class StartController extends Controller {

    public StartController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void control() {
        this.viewFactory.createStartView().write();
        this.writeBoard();
    }

    

}
