package connect4.modelViewController.composite.views.console;

import connect4.modelViewController.composite.controllers.ResumeController;
import connect4.modelViewController.composite.utils.YesNoDialog;

public class ResumeView {

    public boolean interact(ResumeController controller) {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            controller.reset();
        } else {
            controller.nextState();
        }

        return isResumed.isAffirmative();
    }

}
