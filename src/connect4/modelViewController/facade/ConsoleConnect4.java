package connect4.modelViewController.facade;

import connect4.modelViewController.facade.views.View;
import connect4.modelViewController.facade.views.console.ConsoleView;

public class ConsoleConnect4 extends Connect4 {

    protected View createView() {
        return new ConsoleView(this.logic);
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }

}