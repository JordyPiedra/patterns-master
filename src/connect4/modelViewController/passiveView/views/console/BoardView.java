package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.types.Coordinate;
import connect4.modelViewController.passiveView.utils.Console;

public class BoardView extends connect4.modelViewController.passiveView.views.BoardView {

    public void write() {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                new ColorView().interact(this.colors.get(i * Coordinate.DIMENSION_COLUMN + j));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.VERTICAL_LINE);

    }

}
