package connect4.modelViewController.basic.views.console;

import connect4.modelViewController.basic.controllers.ResumeController;
import connect4.modelViewController.basic.utils.Message;
import connect4.modelViewController.basic.utils.YesNoDialog;

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
