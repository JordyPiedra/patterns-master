package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.types.Color;
import connect4.modelView.withFactoryMethod.utils.Console;

public class ColorView {

    public void interact(Color color) {
        String colorName = "*";
        if (!color.isNull()) {
            colorName = color.name().substring(0, 1);
        }
        Console.getInstance().write(colorName);
    }

}
