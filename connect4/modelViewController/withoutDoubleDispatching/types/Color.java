package connect4.modelViewController.withoutDoubleDispatching.types;

public enum Color {
    RED,
    BLUE,
    NULL;

    public boolean isNull() {
        return Color.NULL.equals(this);
    }

}
