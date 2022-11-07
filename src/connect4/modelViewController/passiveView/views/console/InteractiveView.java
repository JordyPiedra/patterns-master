package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.controllers.Controller;

public abstract class InteractiveView<T extends Controller> {
    protected T controller;

    public InteractiveView(T controller) {
        this.controller = controller;
    }

}
