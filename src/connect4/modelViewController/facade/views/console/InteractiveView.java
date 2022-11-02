package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Logic;

public abstract class InteractiveView {

    protected Logic logic;

    public InteractiveView(Logic logic) {
        this.logic = logic;
    }

}
