package connect4.modelView.withoutFactoryMethod.views.console;

import connect4.modelView.withoutFactoryMethod.models.Game;
import connect4.modelView.withoutFactoryMethod.utils.Message;
import connect4.modelView.withoutFactoryMethod.utils.YesNoDialog;

public class ResumeView extends InteractiveView {

    public ResumeView(Game game) {
        super(game);
     }

     public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.game.reset();
        }
        return isResumed.isAffirmative();
    }


}
