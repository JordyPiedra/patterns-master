package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.types.Color;
import connect4.modelViewController.facade.utils.Console;

public class ColorView {

    public void interact(Color color) {
        String colorName = "*";
        if (!color.isNull()) {
            colorName = color.name().substring(0, 1);
        }
        Console.getInstance().write(colorName);
    }

}
