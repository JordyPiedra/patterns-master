package connect4.modelView.withoutFactoryMethod.views.console;

import connect4.modelView.withoutFactoryMethod.models.Game;

public abstract class InteractiveView {
    protected Game game;

    public InteractiveView(Game game) {
        this.game = game;
    }
    
}
