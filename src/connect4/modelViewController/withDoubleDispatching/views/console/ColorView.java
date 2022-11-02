package connect4.modelViewController.withDoubleDispatching.views.console;

import connect4.modelViewController.withDoubleDispatching.types.Color;
import connect4.modelViewController.withDoubleDispatching.utils.Console;

public class ColorView {

    public void interact(Color color) {
        String colorName = "*";
        if (!color.isNull()) {
            colorName = color.name().substring(0, 1);
        }
        Console.getInstance().write(colorName);
    }

}
