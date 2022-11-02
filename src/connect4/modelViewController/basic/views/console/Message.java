package connect4.modelViewController.basic.views.console;

public enum Message {
    TITLE("#########CONNECT4#######"),
    HORIZONTAL_LINE("---------------"),
    VERTICAL_LINE(" | "),

    ENTER_COLUMN_TO_PUT("Put token column position "),

    PLAYER_WIN("#player player: You win!!! :-)"),

    GAME_FINISHED("Game finished - Draw"),

    RESUME("Reset game?"),

    PLAYER_TURN("player #player turn "),

    WRONG_COLUMN("Wrong column");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

}
