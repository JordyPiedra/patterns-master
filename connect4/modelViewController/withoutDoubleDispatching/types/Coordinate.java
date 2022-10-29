package connect4.modelViewController.withoutDoubleDispatching.types;

public class Coordinate {

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

    public boolean isValid(Coordinate limit) {
        return this.row >= 0 && this.row < limit.getRow() && this.column >= 0 && this.column < limit.getColumn();
    }

}
