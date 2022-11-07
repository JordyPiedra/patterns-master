package connect4.modelViewController.passiveView.types;

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

    public boolean isValidRange() {
        return isValidRange(this.row, DIMENSION_ROW) && isValidRange(this.column, DIMENSION_COLUMN);
    }

    public boolean isValidRange(int value, int maxValue) {
        return value >= 0 && value < maxValue;
    }

    public Coordinate move(Direction direction) {
        return sumCoordinate(direction.getCoordinate());
    }

    public Coordinate move(Coordinate coordinate) {
        return sumCoordinate(coordinate);
    }

    private Coordinate sumCoordinate(Coordinate coordinate) {
        return new Coordinate(this.row + coordinate.getRow(), this.column + coordinate.getColumn());
    }

    public Coordinate inverted() {
        return new Coordinate(this.row * -1, this.column * -1);
    }

    public boolean isColumnValid() {
        return this.column >= 0 && this.column < Coordinate.DIMENSION_COLUMN;
    }

}
