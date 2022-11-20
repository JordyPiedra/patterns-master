package connect4.modelViewController.composite.main.controllers;

import connect4.modelViewController.composite.main.models.Session;
import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Error;

public class ActionController extends Controller {

    public ActionController(Session session) {
        super(session);
    }

    public boolean isAllTokensAdded() {
        return this.session.isAllTokensAdded();
    }

    public boolean isConnect4() {
        return this.session.isConnect4();
    }

    public void next() {
        this.session.next();
    }

    public Color getCurrentColor() {
        return this.session.getCurrentColor();
    }

    public void putToken(int column) {
        this.session.putToken(column);
    }

    public Error getPutTokenError(int column) {
        return this.session.getPutTokenError(column);
    }

    public Color getActiveColor() {
        return this.session.getCurrentColor();
    }

}
