package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    GameManager gm;

    public ActionHandler(GameManager gm) {

        this.gm = gm;
    }

    public void actionPerformed(ActionEvent e) {

        String yourChoice = e.getActionCommand();

        switch(yourChoice) {
            case "lookMonk": gm.ui.messageText.setText("I'm here at the front lines of the war with the Goblins"); break;
            case "talkMonk": gm.ui.messageText.setText("I'm ready to do what I can for King and Country");break;
            case "attackMonk": gm.ui.messageText.setText("Whoa there! Don't tempt me with a good time"); break;
        }

    }
}
