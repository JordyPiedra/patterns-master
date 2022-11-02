package connect4.modelView.withoutFactoryMethod;

import connect4.modelView.withoutFactoryMethod.models.Game;
import connect4.modelView.withoutFactoryMethod.views.View;
import connect4.modelView.withoutFactoryMethod.views.graphics.GraphicsView;


public class GraphicsConnect4 {
    private Game game;
    private View view;

    GraphicsConnect4() {
        this.game = new Game();
        this.view = new GraphicsView(this.game);
    }

    private void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

    public static void main(String[] args) {
        new GraphicsConnect4().play();
    }

}