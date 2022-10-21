package connect4.modelView.withoutFactoryMethod.views.console;

import connect4.modelView.withoutFactoryMethod.models.Game;

public class StartView extends InteractiveView {

    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView(this.game).interact();
    }

}
