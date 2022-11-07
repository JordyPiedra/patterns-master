package connect4.modelViewController.passiveView;

import connect4.modelViewController.passiveView.views.graphics.GraphicsViewFactory;

public class GraphicsConnect4 extends Connect4 {

    protected GraphicsViewFactory createViewFactory() {
        return new GraphicsViewFactory();
    }

    public static void main(String[] args) {
        new GraphicsConnect4().play();
    }

}