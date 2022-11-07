package connect4.modelViewController.passiveView.views;

public abstract class ViewFactory {

    public abstract BoardView createBoardView();

    public abstract ColumnView createColumnView();

    public abstract PlayerView createPlayerView();

    public abstract ResumeView createResumeView();

    public abstract StartView createStartView();

    public abstract ErrorView createErrorView();

    public abstract MessageView createMessageView();

}
