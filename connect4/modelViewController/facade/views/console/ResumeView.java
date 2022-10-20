package connect4.modelViewController.facade.views.console;

import connect4.modelViewController.facade.controllers.ResumeController;
import connect4.modelViewController.facade.utils.Message;
import connect4.modelViewController.facade.utils.YesNoDialog;

public class ResumeView extends InteractiveView<ResumeController> {

    public ResumeView(ResumeController controller) {
        super(controller);
    }

    public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.controller.reset();
        }
        return isResumed.isAffirmative();
    }


}
