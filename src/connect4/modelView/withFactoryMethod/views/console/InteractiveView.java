package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Game;

public abstract class InteractiveView {
    protected Game game;

    public InteractiveView(Game game) {
        this.game = game;
    }
    
}
