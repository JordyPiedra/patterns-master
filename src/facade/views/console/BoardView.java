package facade.views.console;

import facade.controllers.Controller;
import facade.types.Coordinate;
import facade.utils.Console;
import facade.utils.Message;

public class BoardView extends InteractiveView {

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
