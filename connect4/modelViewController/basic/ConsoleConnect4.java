package connect4.modelViewController.basic;

import connect4.modelViewController.basic.views.View;
import connect4.modelViewController.basic.views.console.ConsoleView;

public class ConsoleConnect4 extends Connect4 {

    protected View createView() {
        return new ConsoleView(this.startController, this.playController, this.resumeController);
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }


 

}