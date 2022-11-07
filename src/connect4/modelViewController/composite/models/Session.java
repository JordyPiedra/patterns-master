package connect4.modelViewController.composite.models;

import connect4.modelViewController.composite.types.Color;
import connect4.modelViewController.composite.types.Coordinate;
import connect4.modelViewController.composite.types.Error;

public class Session {

    private State state;
    private Game game;
    private Registry registry;

    public Session() {
        this.state = new State();
        this.game = new Game();
        this.registry = new Registry(game);
    }

    public void reset() {
        this.game.reset();
        this.state.reset();
        this.registry.reset();
    }

    public void nextState() {
        this.state.next();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public boolean undoable() {
        return this.registry.undoable();
    }

    public boolean redoable() {
        return this.registry.redoable();
    }

    public void undo() {
        this.registry.undo();
    }

    public void redo() {
        this.registry.redo();
    }

    public void next() {
        this.game.next();
        this.registry.register();
    }

    public Color getColor(Coordinate coordinate) {
        return this.game.getColor(coordinate);
    }

    public boolean isAllTokensAdded() {
        return this.game.isAllTokensAdded();
    }

    public boolean isConnect4() {
        return this.game.isConnect4();
    }

    public Error getPutTokenError(int column) {
        return this.game.getPutTokenError(column);
    }

    public void putToken(int column) {
        this.game.putToken(column);
    }

    public int getCurrentPlayer() {
        return this.game.getCurrentPlayer();
    }

    public Color getCurrentColor() {
        return this.game.getCurrentColor();
    }

}
