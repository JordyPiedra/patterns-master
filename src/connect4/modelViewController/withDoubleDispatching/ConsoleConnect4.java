package connect4.modelViewController.withDoubleDispatching;

import connect4.modelViewController.withDoubleDispatching.views.View;
import connect4.modelViewController.withDoubleDispatching.views.console.ConsoleView;

public class ConsoleConnect4 extends Connect4 {

    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }

}