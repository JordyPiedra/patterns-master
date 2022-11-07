package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.utils.Console;

public class MessageView implements connect4.modelViewController.passiveView.views.MessageView {

    public void write(Message message) {
        Console.getInstance().write(message.toString());
    }

    public void writeln(Message message) {
        Console.getInstance().writeln(message.toString());
    }

    public void write(Message message, int player) {
        assert message == Message.PLAYER_WIN;

        Console.getInstance().writeln(message.toString().replaceAll("#player", "" + player));
    }

}
