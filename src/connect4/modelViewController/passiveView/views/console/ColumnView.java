package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.types.Coordinate;
import connect4.modelViewController.passiveView.utils.Console;

public class ColumnView implements connect4.modelViewController.passiveView.views.ColumnView {

    @Override
    public int read(String message) {
        int column;
        do {
            column = Console.getInstance().readInt(message) - 1;
        } while (!isColumnValid(column));
        return column;
    }

    public boolean isColumnValid(int column) {
        return new Coordinate(column, 0).isColumnValid();
    }

}
