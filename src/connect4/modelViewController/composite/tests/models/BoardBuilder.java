package connect4.modelViewController.composite.tests.models;

import connect4.modelViewController.composite.main.models.Board;
import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Coordinate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardBuilder {

    private Map<Integer, List<Color>> tokens;

    public BoardBuilder() {
        this.tokens = new HashMap<>();
    }


    public BoardBuilder token(Color color, Integer column) {
        assert column <= Coordinate.DIMENSION_COLUMN;
        assert column > 0;
        assert column != null;
        this.addToken(color, column);
        return this;
    }


    public Board build() {
        Board board = new Board();
        for (Map.Entry<Integer, List<Color>> entry : tokens.entrySet()) {
            for (Color color : entry.getValue()) {
                board.putToken(entry.getKey(), color);
            }
        }
        return board;
    }


    public BoardBuilder full() {
        for (int i = 0; i < Coordinate.DIMENSION_COLUMN; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_ROW; j++) {
                this.addToken(Color.RED, i);
            }
        }
        return this;
    }

    private void addToken(Color color, Integer column) {
        List<Color> colorList = this.tokens.get(column);
        if (colorList == null) {
            colorList = new ArrayList<>();
        }
        colorList.add(color);
        this.tokens.put(column, colorList);
    }
}