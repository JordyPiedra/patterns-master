package connect4.modelViewController.basic;

import connect4.modelViewController.basic.controllers.PlayController;
import connect4.modelViewController.basic.controllers.ResumeController;
import connect4.modelViewController.basic.controllers.StartController;
import connect4.modelViewController.basic.models.Game;
import connect4.modelViewController.basic.views.View;

abstract class Connect4 {
    private Game game;
    protected View view;
    protected StartController startController;
    protected PlayController playController;
    protected ResumeController resumeController;

    public Connect4() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
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