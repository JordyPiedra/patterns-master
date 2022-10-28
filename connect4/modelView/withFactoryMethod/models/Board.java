package connect4.modelView.withFactoryMethod.models;

import connect4.modelView.withFactoryMethod.types.Color;
import connect4.modelView.withFactoryMethod.types.Coordinate;

public class Board {

    public static final int DIMENSION_ROW = 7;
    public static final int DIMENSION_COLUMN = 6;
    Color[][] colors;

    Coordinate lastToken;

    Board() {
        this.colors = new Color[DIMENSION_ROW][DIMENSION_COLUMN];
        this.reset();
    }

    public void reset() {

        for (int i = 0; i < DIMENSION_ROW; i++) {
            for (int j = 0; j < DIMENSION_COLUMN; j++) {
                this.colors[i][j] = Color.NULL;
            }
        }
    }

    public int getNextRow(int column) {
        int row = DIMENSION_ROW - 1;
        while (!this.colors[row][column].isNull() && row > 0) {
            row--;
        }
        return row;
    }

    public boolean isColumnValid(int column) {
        return column >= 0 && column <= DIMENSION_COLUMN;
    }

    public boolean isNextRowValid(int column) {
        return this.colors[0][column].isNull();
    }

    public void putToken(int column, Color color) {
        Coordinate coordinate = new Coordinate(getNextRow(column), column);
        this.colors[coordinate.getRow()][coordinate.getColumn()] = color;
        lastToken = coordinate;
    }

    public Color getColor(Coordinate coordinate) {
        return colors[coordinate.getRow()][coordinate.getColumn()];
    }

    public boolean isCoordinateValid(Coordinate coordinate) {
        return coordinate.isValid(new Coordinate(DIMENSION_ROW, DIMENSION_COLUMN));
    }

    public Color getCurrentColor() {
        return colors[lastToken.getRow()][lastToken.getColumn()];
    }

    public Coordinate getLastToken() {
        return lastToken;
    }

}
