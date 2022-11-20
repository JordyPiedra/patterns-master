package connect4.modelViewController.composite.main.views.console;

import connect4.modelViewController.composite.main.controllers.Controller;
import connect4.modelViewController.composite.main.types.Coordinate;
import connect4.modelViewController.composite.main.utils.Console;

public class BoardView {

    public void interact(Controller controller) {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                new ColorView().interact(controller.getColor(new Coordinate(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.VERTICAL_LINE);

    }
}
