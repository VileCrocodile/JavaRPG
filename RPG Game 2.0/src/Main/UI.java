package Main;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class UI {

    GameManager gm;

    JFrame window;
    public JTextArea messageText;
    public JPanel[] bgPanel = new JPanel[10];
    public JLabel[] bgLabel = new JLabel[10];


    public UI(GameManager gm) {

        this.gm =gm;

        createMainField();
        generateScreen();

        window.setVisible(true);

    }

    public void createMainField() {

        window = new JFrame();
        window.setSize(800,600);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        //Title
        window.setTitle("RPG Game 2.0");
        //??
        window.setLayout(null);

        messageText = new JTextArea("You find yourself in the province of Garbeth, in the realm of Luminor. ");
        //Text Image Panel Location??
        messageText.setBounds(50,410,700,150);
        //Text Background Color
        messageText.setBackground(Color.WHITE);
        // Text Color
        messageText.setForeground(Color.BLACK);
        //Can it be changed?
        messageText.setEditable(false);
        //Can the text keep going?
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        // FONT
        messageText.setFont(new Font("Book antiqua", Font.PLAIN, 20));
        window.add(messageText);

    }
    public void createBackground(int bgNum, String bgFileName) {

        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,85,600,350);
        bgPanel[bgNum].setBackground(Color.BLACK);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[1]);

        bgLabel[bgNum] = new JLabel();
        //Te
        bgLabel[bgNum].setBounds(0,0,700,350);
        ImageIcon bgIcon = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Main_Image_2.jpg")));
        bgLabel[bgNum].setIcon(bgIcon);
        bgLabel[bgNum].setHorizontalAlignment(JLabel.CENTER);
        bgLabel[bgNum].setVerticalAlignment(JLabel.CENTER);

        bgPanel[1].add(bgLabel[1]);
    }

    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFileName) {

        JLabel objectLabel = new JLabel();
        //Fighter Coordinates
        //objectLabel.setBounds(440,140,200,200);
        objectLabel.setBounds(objx,objy,objWidth,objHeight);

        ImageIcon objectIcon = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource(objFileName)));
        objectLabel.setIcon(objectIcon);

        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[1]);

    }

    public void generateScreen() {

        //SCREEN1
        createBackground(1, "Main_Image_2.jpg");
        createObject(1, 70, 180, 150, 150, "Monk_2.png");
        //createObject(1, 440, 140, 200, 200, "Monk_2.png");
        //createObject(1, 440, 140, 200, 200, "Monk_2.png");

    }

}
