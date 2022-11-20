package connect4.modelViewController.composite.main.controllers;

import connect4.modelViewController.composite.main.models.Session;

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