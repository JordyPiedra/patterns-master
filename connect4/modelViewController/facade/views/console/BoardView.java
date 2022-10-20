package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Controller;
import connect4.modelViewController.facade.types.Coordinate;
import connect4.modelViewController.facade.utils.Console;
import connect4.modelViewController.facade.utils.Message;

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
