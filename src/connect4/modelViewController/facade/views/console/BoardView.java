package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Logic;
import connect4.modelViewController.facade.types.Coordinate;
import connect4.modelViewController.facade.utils.Console;

public class BoardView extends InteractiveView {

    public BoardView(Logic logic) {
        super(logic);
    }

    public void interact() {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                new ColorView().interact(this.logic.getColor(new Coordinate(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.VERTICAL_LINE);

    }
}
