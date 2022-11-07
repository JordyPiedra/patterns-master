package connect4.modelViewController.passiveView.views;

import java.util.ArrayList;
import java.util.List;

import connect4.modelViewController.passiveView.types.Color;
import connect4.modelViewController.passiveView.types.Coordinate;

public abstract class BoardView {

    protected List<Color> colors;

    public BoardView() {
        this.colors = new ArrayList<>();
    }

    public void set(Color color) {
        assert this.colors.size() < Coordinate.DIMENSION_ROW * Coordinate.DIMENSION_COLUMN;

        this.colors.add(color);
    }

    public abstract void write();

}
