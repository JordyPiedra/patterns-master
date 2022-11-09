package connect4.modelViewController.basic.types;

public enum Direction {
    RIGHT(0, 1),
    UP(1, 0),
    UP_RIGHT(-1, 1),
    UP_LEFT(-1, -1);

    private Coordinate coordinate;

    Direction(int row, int column) {
        this.coordinate = new Coordinate(row, column);
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    public Coordinate inverted() {
        return this.coordinate.inverted();
    }

}
