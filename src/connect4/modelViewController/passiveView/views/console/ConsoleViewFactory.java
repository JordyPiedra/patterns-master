package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.views.MessageView;
import connect4.modelViewController.passiveView.views.ViewFactory;

public class ConsoleViewFactory extends ViewFactory {

    @Override
    public BoardView createBoardView() {
        return new BoardView();
    }

    @Override
    public ColumnView createColumnView() {
        return new ColumnView();
    }

    @Override
    public PlayerView createPlayerView() {
        return new PlayerView();
    }

    @Override
    public ResumeView createResumeView() {
        return new ResumeView();
    }

    @Override
    public StartView createStartView() {
        return new StartView();
    }

    @Override
    public ErrorView createErrorView() {
        return new ErrorView();
    }

    @Override
    public MessageView createMessageView() {
        return new connect4.modelViewController.passiveView.views.console.MessageView();
    }

}
