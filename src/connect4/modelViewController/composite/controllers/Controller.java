package connect4.modelViewController.composite.controllers;

import connect4.modelViewController.composite.models.Session;
import connect4.modelViewController.composite.types.Color;
import connect4.modelViewController.composite.types.Coordinate;

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
