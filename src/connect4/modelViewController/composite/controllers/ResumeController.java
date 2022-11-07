package connect4.modelViewController.composite.controllers;

import connect4.modelViewController.composite.models.Session;

public class ResumeController extends Controller implements AcceptorController{

    public ResumeController(Session session) {
        super(session);
    }

    public void reset() {
        this.session.reset();        
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
