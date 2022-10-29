package connect4.modelViewController.withoutDoubleDispatching.views.console;

import connect4.modelViewController.withoutDoubleDispatching.types.Error;
import connect4.modelViewController.withoutDoubleDispatching.utils.Console;

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
