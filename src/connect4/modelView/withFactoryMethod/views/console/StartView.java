package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Game;

public class StartView extends InteractiveView {

    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView(this.game).interact();
    }

}
