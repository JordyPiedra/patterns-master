package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.types.Color;
import connect4.modelViewController.basic.utils.Console;

public class ColorView {

    public void interact(Color color) {
        String colorName = "*";
        if (!color.isNull()) {
            colorName = color.name().substring(0, 1);
        }
        Console.getInstance().write(colorName);
    }

}
