package connect4.modelView.withFactoryMethod.views;

import connect4.modelView.withFactoryMethod.models.Game;

public abstract class WithGameView {
    protected Game game;

    protected WithGameView(Game game) {
        this.game = game;
    }

}
