package connect4.modelView.withoutFactoryMethod.views;

import connect4.modelView.withoutFactoryMethod.models.Game;

public abstract class WithGameView {
    protected Game game;

    protected WithGameView(Game game) {
        this.game = game;
    }

}
