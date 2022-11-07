package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.types.Color;
import connect4.modelViewController.passiveView.utils.Console;

public class ColorView {

    public void interact(Color color) {
        String colorName = "*";
        if (!color.isNull()) {
            colorName = color.name().substring(0, 1);
        }
        Console.getInstance().write(colorName);
    }

}
