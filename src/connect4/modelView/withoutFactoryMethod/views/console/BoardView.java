package connect4.modelView.withoutFactoryMethod.views.console;

import connect4.modelView.withoutFactoryMethod.models.Board;
import connect4.modelView.withoutFactoryMethod.models.Game;
import connect4.modelView.withoutFactoryMethod.types.Coordinate;
import connect4.modelView.withoutFactoryMethod.utils.Console;

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
