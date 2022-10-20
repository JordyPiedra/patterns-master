package connect4.modelView.withoutFactoryMethod.views;

import connect4.modelView.withoutFactoryMethod.models.Game;

public abstract class View extends WithGameView {

    public View(Game game) {
        super(game);
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();

}
