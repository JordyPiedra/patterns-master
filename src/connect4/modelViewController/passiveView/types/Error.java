package connect4.modelViewController.passiveView.types;

public enum Error {

    WRONG_COLUMN,
    FULL_COLUMN,
    NULL;

    public boolean isNull() {
        return this == Error.NULL;
    }

}
