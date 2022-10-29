package connect4.modelViewController.withDoubleDispatching.views.console;

import connect4.modelViewController.withDoubleDispatching.controllers.ResumeController;
import connect4.modelViewController.withDoubleDispatching.utils.YesNoDialog;

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
