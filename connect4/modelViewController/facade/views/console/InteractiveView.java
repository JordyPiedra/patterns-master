package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Controller;

public abstract class InteractiveView<T extends Controller> {
    protected T controller;

    public InteractiveView(T controller) {
        this.controller = controller;
    }
    
}
