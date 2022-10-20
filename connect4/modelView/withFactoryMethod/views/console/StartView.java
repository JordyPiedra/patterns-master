package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.utils.Message;

public class StartView extends InteractiveView {

    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        Message.TITLE.writeln();
        new BoardView(this.game).interact();
    }

}
