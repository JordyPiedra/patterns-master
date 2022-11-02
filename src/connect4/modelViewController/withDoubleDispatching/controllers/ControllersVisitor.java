package connect4.modelViewController.withDoubleDispatching.controllers;

public interface ControllersVisitor {

    public void accept(StartController controller);

    public void accept(PlayController controller);

    public boolean accept(ResumeController controller);

}
