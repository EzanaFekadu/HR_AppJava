package main.java.com.example.HR_AppJava.HR_App;

import javax.swing.*;
import java.awt.*;

public class GUI_Home {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(WelcomePage::new);
    }
}

class WelcomePage extends JFrame {
    public WelcomePage() {
        setTitle("Welcome");
        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(BorderLayout());
        ImageIcon imageIcon = new ImageIcon("HR_App/HR_App_Logo.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setIcon(new ImageIcon(getClass().getResource("HR_App/HR_App_Logo.png")));

        JButton starButton = new JButton("Start");

        starButton.addActionListener(e -> {
            setVisible(false);/* 
            new LoginScreen(); */
        });

        panel.add(imageIcon);
        panel.add(imageLabel);
        panel.add(starButton);


        add(panel);
        setVisible(true);
    }
}
