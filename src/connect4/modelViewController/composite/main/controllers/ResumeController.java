package connect4.modelViewController.composite.main.controllers;

import connect4.modelViewController.composite.main.models.Session;

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
