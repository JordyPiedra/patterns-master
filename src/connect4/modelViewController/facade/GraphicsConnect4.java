package connect4.modelViewController.facade;

import connect4.modelViewController.facade.views.View;
import connect4.modelViewController.facade.views.graphics.GraphicsView;

public class GraphicsConnect4 extends Connect4 {

    protected View createView() {
        return new GraphicsView(this.logic);
    }

    public static void main(String[] args) {
        new GraphicsConnect4().play();
    }

}