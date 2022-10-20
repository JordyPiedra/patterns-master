package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.controllers.Controller;

public abstract class InteractiveView<T extends Controller> {
    protected T controller;

    public InteractiveView(T controller) {
        this.controller = controller;
    }
    
}
