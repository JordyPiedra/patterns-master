package connect4.modelViewController.facade;

import connect4.modelViewController.facade.controllers.Logic;
import connect4.modelViewController.facade.views.View;

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
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

}