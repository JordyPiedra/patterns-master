package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.types.Error;
import connect4.modelViewController.passiveView.utils.Console;

public class ErrorView implements connect4.modelViewController.passiveView.views.ErrorView  {

    static final String[] MESSAGES = {
            "Wrong column",
            "Column is not empty",
    };


    @Override
    public void write(Error error) {
        if (!error.isNull()) {
            Console.getInstance().writeln(ErrorView.MESSAGES[error.ordinal()]);
        }
        
    }

}
