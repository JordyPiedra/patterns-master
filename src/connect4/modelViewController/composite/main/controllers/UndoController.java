package connect4.modelViewController.composite.main.controllers;

import connect4.modelViewController.composite.main.models.Session;

class UndoController extends Controller {

    UndoController(Session session) {
        super(session);
    }

    void undo() {
        this.session.undo();
    }

    boolean undoable() {
        return this.session.undoable();
    }

}