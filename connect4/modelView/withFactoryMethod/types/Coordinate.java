package connect4.modelView.withFactoryMethod.types;

public class Coordinate {

    private int column, row;

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

}
