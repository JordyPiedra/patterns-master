package connect4.modelViewController.composite.controllers;

import connect4.modelViewController.composite.models.Session;

public class RedoController extends Controller {

    RedoController(Session session) {
        super(session);
    }

    void redo() {
        this.session.redo();
    }

    boolean redoable() {
        return this.session.redoable();
    }

}