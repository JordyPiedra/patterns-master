package connect4.modelViewController.composite.main;

import connect4.modelViewController.composite.main.views.View;
import connect4.modelViewController.composite.main.views.graphics.GraphicsView;

public class GraphicsConnect4 extends Connect4 {

    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsConnect4().play();
    }

}