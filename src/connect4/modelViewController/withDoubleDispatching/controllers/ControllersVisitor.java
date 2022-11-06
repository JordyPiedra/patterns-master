package connect4.modelViewController.withDoubleDispatching.controllers;

public interface ControllersVisitor {

    public void visit(StartController controller);

    public void visit(PlayController controller);

    public boolean visit(ResumeController controller);

}
