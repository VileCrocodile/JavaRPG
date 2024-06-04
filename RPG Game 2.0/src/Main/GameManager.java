package Main;

import javax.swing.*;

public class GameManager extends JFrame{

    ActionHandler aHandler = new ActionHandler(this);

    UI ui = new UI(this);

    public static void main(String[] args) {

        new GameManager();
    }
    public  GameManager() {

    }

}
