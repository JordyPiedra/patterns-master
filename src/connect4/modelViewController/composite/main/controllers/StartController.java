package connect4.modelViewController.composite.main.controllers;

import connect4.modelViewController.composite.main.models.Session;

public class StartController extends Controller implements AcceptorController{

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
        
    }


}
