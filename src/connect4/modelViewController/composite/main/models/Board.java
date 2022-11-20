package connect4.modelViewController.composite.main.models;

import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Coordinate;

public class Board {

    private Color[][] colors;

    private Coordinate lastToken;

    public Board() {
        this.colors = new Color[Coordinate.DIMENSION_ROW][Coordinate.DIMENSION_COLUMN];
        this.reset();
    }

    public void reset() {

        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                this.colors[i][j] = Color.NULL;
            }
        }
        lastToken = null;
    }

    public int getNextRow(int column) {
        int row = Coordinate.DIMENSION_ROW - 1;
        while (!this.colors[row][column].isNull() && row > 0) {
            row--;
        }
        return row;
    }

    public boolean isColumnValid(int column) {
        return column >= 0 && column <= Coordinate.DIMENSION_COLUMN;
    }

    public boolean isNextRowValid(int column) {
        return this.colors[0][column].isNull();
    }

    public void putToken(int column, Color color) {
        Coordinate coordinate = new Coordinate(getNextRow(column), column);
        this.putToken(coordinate, color);
    }

    public void putToken(Coordinate coordinate, Color color) {
        this.colors[coordinate.getRow()][coordinate.getColumn()] = color;
        lastToken = coordinate;
    }

    public Color getColor(Coordinate coordinate) {
        return colors[coordinate.getRow()][coordinate.getColumn()];
    }

    public Color getCurrentColor() {
        return colors[lastToken.getRow()][lastToken.getColumn()];
    }

    public Coordinate getLastToken() {
        return lastToken;
    }

    char[] toCharacterArray() {
        char[] characters = new char[Coordinate.DIMENSION_ROW * Coordinate.DIMENSION_COLUMN];
        int charactersCount = 0;
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                characters[charactersCount++] = this.colors[i][j].toString().charAt(0);
            }
        }
        return characters;
    }

}
