package connect4.modelView.withoutFactoryMethod.views.console;

import connect4.modelView.withoutFactoryMethod.models.Game;
import connect4.modelView.withoutFactoryMethod.utils.Message;

public class StartView extends InteractiveView {

    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        Message.TITLE.writeln();
        new BoardView(this.game).interact();
    }

}
