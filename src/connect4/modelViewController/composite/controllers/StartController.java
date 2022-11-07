package connect4.modelViewController.composite.controllers;

import connect4.modelViewController.composite.models.Session;

public class StartController extends Controller implements AcceptorController{

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
        
    }


}
