package connect4.modelViewController.facade.views;

import connect4.modelViewController.facade.controllers.Logic;

public abstract class View {

    protected Logic logic;

    public View(Logic logic) {
        this.logic = logic;
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();

}
