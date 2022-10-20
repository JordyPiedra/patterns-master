package connect4.modelView.withFactoryMethod;

import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.views.View;
import connect4.modelView.withFactoryMethod.views.console.ConsoleView;

public class ConsoleConnect4 {
    private Game game;
    private View view;

    ConsoleConnect4() {
        this.game = new Game();
        this.view = new ConsoleView(this.game);
    }

    private void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }

}