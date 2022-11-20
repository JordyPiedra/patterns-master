package connect4.modelViewController.composite.tests.models;

import connect4.modelViewController.composite.main.models.Board;
import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BoardBuilder {

    private List<String> rows;

    public BoardBuilder() {
        this.rows = new ArrayList<>();
    }

    public BoardBuilder rows(String... rows) {
        assert rows.length == 3;
        for (String row : rows) {
            assert Pattern.matches("[XO ]{3}", row);
            this.rows.add(row);
        }
        return this;
    }

    public Board build() {
        Board board = new Board();
        if (!this.rows.isEmpty()) {
            for (int i = 0; i < this.rows.size(); i++) {
                String string = this.rows.get(i);
                for (int j = 0; j < string.length(); j++) {
                    board.putToken(new Coordinate(i, j), this.getColor(string.charAt(j)));
                }
            }
        }
        return board;
    }

    private Color getColor(char character) {
        Color result = Color.NULL;
        for (int i = 0; i < Color.values().length - 1; i++) {
            Color color = Color.values()[i];
            if (color.name().equals("" + character)) {
                result = color;
            }
        }
        return result;
    }

}