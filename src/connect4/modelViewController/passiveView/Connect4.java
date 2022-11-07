package connect4.modelViewController.passiveView;

import connect4.modelViewController.passiveView.controllers.PlayController;
import connect4.modelViewController.passiveView.controllers.ResumeController;
import connect4.modelViewController.passiveView.controllers.StartController;
import connect4.modelViewController.passiveView.models.Game;
import connect4.modelViewController.passiveView.views.ViewFactory;

abstract class Connect4 {
    private Game game;
    private ViewFactory viewFactory;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;

    protected Connect4() {
        this.game = new Game();
        this.viewFactory = this.createViewFactory();
        this.startController = new StartController(this.game, this.viewFactory);
        this.playController = new PlayController(this.game, this.viewFactory);
        this.resumeController = new ResumeController(this.game, this.viewFactory);
    }

    protected abstract ViewFactory createViewFactory();

    protected void play() {
        do {
            this.startController.control();
            this.playController.control();
        } while (this.resumeController.control());
    }

}