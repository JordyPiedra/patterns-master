package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.types.Error;
import connect4.modelView.withFactoryMethod.utils.Console;

public class ErrorView {

    static final String[] MESSAGES = {
            "Wrong column",
            "Column is not empty",
    };

    void writeln(Error error) {
        if (!error.isNull()) {
            Console.getInstance().writeln(ErrorView.MESSAGES[error.ordinal()]);
        }
    }

}
