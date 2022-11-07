package connect4.modelViewController.passiveView.views.console;

public class StartView implements connect4.modelViewController.passiveView.views.StartView {

    public void write() {
        new MessageView().writeln(Message.TITLE);
    }
}
