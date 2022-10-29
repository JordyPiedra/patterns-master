package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.Logic;
import connect4.modelViewController.facade.utils.YesNoDialog;

public class ResumeView extends InteractiveView {

    public ResumeView(Logic logic) {
        super(logic);
    }

    public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.logic.reset();
        }
        return isResumed.isAffirmative();
    }

}
