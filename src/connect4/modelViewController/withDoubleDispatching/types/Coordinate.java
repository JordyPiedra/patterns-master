package connect4.modelViewController.withDoubleDispatching.types;

public class Coordinate {

    public static final int DIMENSION_ROW = 7;
    public static final int DIMENSION_COLUMN = 6;

    private int column;

    private int row;

    public Coordinate(int row, int column) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean isValid() {
        return this.row >= 0 && this.row < DIMENSION_ROW && this.column >= 0 && this.column < DIMENSION_COLUMN;
    }

}
