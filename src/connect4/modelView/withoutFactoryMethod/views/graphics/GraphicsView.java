package connect4.modelView.withoutFactoryMethod.views.graphics;

import connect4.modelView.withoutFactoryMethod.models.Game;
import connect4.modelView.withoutFactoryMethod.views.View;

public class GraphicsView extends View{

    public GraphicsView(Game game) {
        super(game);
        System.out.println("Graphics Connect4!!!");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean resume() {
        // TODO Auto-generated method stub
        return false;
    }

 

}
