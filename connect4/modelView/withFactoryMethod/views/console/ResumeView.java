package connect4.modelView.withFactoryMethod.views.console;

import connect4.modelView.withFactoryMethod.models.Game;
import connect4.modelView.withFactoryMethod.utils.Message;
import connect4.modelView.withFactoryMethod.utils.YesNoDialog;

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
