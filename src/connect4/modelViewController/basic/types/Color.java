package connect4.modelViewController.basic.types;

public enum Color {
    RED,
    BLUE,
    NULL;

    public boolean isNull() {
        return Color.NULL.equals(this);
    }

}
