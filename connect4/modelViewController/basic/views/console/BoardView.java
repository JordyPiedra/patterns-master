package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.controllers.Controller;
import connect4.modelViewController.basic.types.Coordinate;
import connect4.modelViewController.basic.utils.Console;
import connect4.modelViewController.basic.utils.Message;

public class BoardView extends InteractiveView<Controller> {

    public BoardView(Controller controller) {
        super(controller);
    }

    public void interact() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < controller.getDimensionRow(); i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < controller.getDimensionColumn(); j++) {
                new ColorView().interact(this.controller.getColor(new Coordinate(i, j)));
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }
}
