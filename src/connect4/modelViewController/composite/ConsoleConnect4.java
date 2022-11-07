package connect4.modelViewController.composite;

import connect4.modelViewController.composite.views.View;
import connect4.modelViewController.composite.views.console.ConsoleView;

public class ConsoleConnect4 extends Connect4 {

    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }

}