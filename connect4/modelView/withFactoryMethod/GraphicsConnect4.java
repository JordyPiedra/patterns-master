package connect4.modelView.withFactoryMethod;

import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.views.View;
import connect4.modelView.withFactoryMethod.views.graphics.GraphicsView;

public class GraphicsConnect4 extends Connect4 {

    @Override
    protected View createView(Game game) {
        return new GraphicsView(game);
    }

    public static void main(String[] args) {
        new GraphicsConnect4().play();
    }

}