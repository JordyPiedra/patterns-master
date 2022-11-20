package connect4.modelViewController.composite.main.controllers;

import connect4.modelViewController.composite.main.models.Session;
import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Coordinate;

public abstract class Controller {

    protected Session session;

    public Controller(Session session) {
        this.session = session;        
    }

    public void nextState() {
        this.session.nextState();
    }

    public Color getColor(Coordinate coordinate) {
        return this.session.getColor(coordinate);
    }
    
}
