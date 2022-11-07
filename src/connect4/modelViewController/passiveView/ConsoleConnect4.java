package connect4.modelViewController.passiveView;

import connect4.modelViewController.passiveView.views.console.ConsoleViewFactory;

public class ConsoleConnect4 extends Connect4 {

    protected ConsoleViewFactory createViewFactory() {
        return new ConsoleViewFactory();
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }

}