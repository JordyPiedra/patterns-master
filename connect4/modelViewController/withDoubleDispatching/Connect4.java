package connect4.modelViewController.withDoubleDispatching;

import connect4.modelViewController.withDoubleDispatching.controllers.Controller;
import connect4.modelViewController.withDoubleDispatching.controllers.Logic;
import connect4.modelViewController.withDoubleDispatching.views.View;

abstract class Connect4 {

    protected View view;
    protected Logic logic;

    public Connect4() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
        Controller controller;
        do {
            controller = logic.getController();
            if (controller != null) {
                controller.accept(this.view);
            }
        } while (controller != null);
    }

}