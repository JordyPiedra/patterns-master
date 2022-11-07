package connect4.modelViewController.composite;

import connect4.modelViewController.composite.controllers.AcceptorController;
import connect4.modelViewController.composite.controllers.Logic;
import connect4.modelViewController.composite.views.View;

abstract class Connect4 {

    protected View view;
    protected Logic logic;

    public Connect4() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
        AcceptorController acceptorController;
        do {
            acceptorController = logic.getController();
            if (acceptorController != null) {
                acceptorController.accept(this.view);
            }
        } while (acceptorController != null);
    }

}