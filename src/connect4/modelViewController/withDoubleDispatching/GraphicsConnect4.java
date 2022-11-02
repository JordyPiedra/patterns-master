package connect4.modelViewController.withDoubleDispatching;

import connect4.modelViewController.withDoubleDispatching.views.View;
import connect4.modelViewController.withDoubleDispatching.views.graphics.GraphicsView;

public class GraphicsConnect4 extends Connect4 {

    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsConnect4().play();
    }

}