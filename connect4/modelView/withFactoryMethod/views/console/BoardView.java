package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Board;
import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.types.Coordinate;
import connect4.modelView.withFactoryMethod.utils.Console;

public class BoardView extends InteractiveView {

    public BoardView(Game game) {
        super(game);
    }

    public void interact() {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Board.DIMENSION_ROW; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Board.DIMENSION_COLUMN; j++) {
                new ColorView().interact(this.game.getColor(new Coordinate(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.VERTICAL_LINE);

    }
}
