package connect4.modelView.withoutFactoryMethod;

import connect4.modelView.withoutFactoryMethod.models.Game;
import connect4.modelView.withoutFactoryMethod.views.View;
import connect4.modelView.withoutFactoryMethod.views.console.ConsoleView;

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