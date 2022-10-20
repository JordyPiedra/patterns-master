package facade.views.console;

import facade.controllers.ResumeController;
import facade.utils.Message;
import facade.utils.YesNoDialog;

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
