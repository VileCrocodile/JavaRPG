import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static JFrame jFrame;
    public static JPanel imagePanel;
    public static JLabel imageLabel;
    public static JTextField jTextField;
    public static JButton nextButton;

    public static void main(String[] args) {
        jFrame = new JFrame("Adventure Game");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(700, 700);

        // Create the panel to contain the images
        imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout());

        // Initially display the first image
        ImageIcon firstImage = new ImageIcon("Images/Image1.png");
        imageLabel = new JLabel(firstImage);
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        // Add the panel to the frame
        jFrame.add(imagePanel);

        // Create the Next button
        JButton nextButton = new JButton("Next");
        jFrame.add(nextButton);
        jFrame.add(nextButton, BorderLayout.SOUTH);

        jTextField = new JTextField("Hello World");
        jTextField.setEditable(false);
        imagePanel.add(jTextField, BorderLayout.SOUTH);

        // Add action listener to the button
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isNext = true;
                if (isNext) { // If currently in "Next" state
                    // Remove the first image label
                    imagePanel.remove(imageLabel);

                    // Change text in the text field
                    jTextField.setText("Goodbye");

                    // Display the second image
                    ImageIcon secondImage = new ImageIcon("second_image.jpg");
                    imageLabel = new JLabel(secondImage);
                    imagePanel.add(imageLabel, BorderLayout.CENTER);

                    // Change button text to "Back"
                    nextButton.setText("Back");
                } else { // If currently in "Back" state
                    // Change text in the text field
                    JTextField.setText("Hello World");

                    // Remove the second image label
                    imagePanel.remove(imageLabel);

                    // Display the first image
                    ImageIcon firstImage = new ImageIcon("first_image.jpg");
                    imageLabel = new JLabel(firstImage);
                    imagePanel.add(imageLabel, BorderLayout.CENTER);

                    // Change button text to "Next"
                    nextButton.setText("Next");
                }

                isNext = !isNext; // Toggle the state
                // Repaint the panel
                imagePanel.revalidate();
                imagePanel.repaint();
            }
        });
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
