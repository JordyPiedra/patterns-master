package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.controllers.Controller;
import connect4.modelViewController.basic.types.Coordinate;
import connect4.modelViewController.basic.utils.Console;

public class BoardView extends InteractiveView<Controller> {

    public BoardView(Controller controller) {
        super(controller);
    }

    public void interact() {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                new ColorView().interact(this.controller.getColor(new Coordinate(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.VERTICAL_LINE);

    }
}
