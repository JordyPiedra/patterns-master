package connect4.modelViewController.facade.types;

public enum Color {
    RED,
    BLUE,
    NULL;

    public boolean isNull() {
        return Color.NULL.equals(this);
    }

}
