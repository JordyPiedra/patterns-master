package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Board;
import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.types.Coordinate;
import connect4.modelView.withFactoryMethod.utils.Console;
import connect4.modelView.withFactoryMethod.utils.Message;

public class BoardView extends InteractiveView {

    public BoardView(Game game) {
        super(game);
    }

    public void interact() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < Board.DIMENSION_ROW; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < Board.DIMENSION_COLUMN; j++) {
                new ColorView().interact(this.game.getColor(new Coordinate(i, j)));
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }
}
