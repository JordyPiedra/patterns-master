package connect4.modelViewController.passiveView.views;

import connect4.modelViewController.passiveView.views.console.Message;

public interface MessageView {
    public void write(Message message);
    public void write(Message message, int player);

}
