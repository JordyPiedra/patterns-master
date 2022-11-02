package connect4.modelViewController.withDoubleDispatching.views.console;

import connect4.modelViewController.withDoubleDispatching.types.Error;
import connect4.modelViewController.withDoubleDispatching.utils.Console;

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
