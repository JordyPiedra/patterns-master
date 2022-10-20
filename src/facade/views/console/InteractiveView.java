package facade.views.console;

import facade.controllers.Controller;

public abstract class InteractiveView<T extends Controller> {
    protected T controller;

    public InteractiveView(T controller) {
        this.controller = controller;
    }
    
}
