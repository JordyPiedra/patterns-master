package connect4.modelViewController.composite.main.controllers;

import connect4.modelViewController.composite.main.models.Session;
import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Error;

public class PlayController extends Controller implements AcceptorController {

    private ActionController actionController;
    private UndoController undoController;
    private RedoController redoController;

    public PlayController(Session session) {
        super(session);
        this.actionController = new ActionController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
    }

    public void undo() {
        this.undoController.undo();
    }

    public boolean undoable() {
        return this.undoController.undoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean redoable() {
        return this.redoController.redoable();
    }

    public boolean isAllTokensAdded() {
        return this.actionController.isAllTokensAdded();
    }

    public boolean isConnect4() {
        return this.actionController.isConnect4();
    }

    public void next() {
        this.actionController.next();
    }

    public Error getPutTokenError(int column) {
        return this.actionController.getPutTokenError(column);
    }

    public void putToken(int column) {
        this.actionController.putToken(column);
    }

    public Color getActiveColor() {
        return this.actionController.getActiveColor();
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public int getCurrentPlayer() {
        return this.session.getCurrentPlayer();
    }

}
