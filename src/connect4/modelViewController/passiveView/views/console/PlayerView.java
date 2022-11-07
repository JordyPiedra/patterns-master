package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.types.Color;

public class PlayerView implements connect4.modelViewController.passiveView.views.PlayerView {

    @Override
    public void writeWinner(Color color) {
        new MessageView().write(Message.PLAYER_WIN, color.ordinal());
    }

}
