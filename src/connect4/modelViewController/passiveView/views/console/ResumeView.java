package connect4.modelViewController.passiveView.views.console;

import connect4.modelViewController.passiveView.utils.YesNoDialog;

public class ResumeView implements connect4.modelViewController.passiveView.views.ResumeView {

    public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        return isResumed.isAffirmative();
    }

}
