package connect4.modelView.withFactoryMethod;

import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.views.View;
import connect4.modelView.withFactoryMethod.views.console.ConsoleView;

public class ConsoleConnect4 extends Connect4 {

    @Override
    protected View createView(Game game) {
        return new ConsoleView(game);
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }

}