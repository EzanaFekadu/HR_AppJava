package com.example.HR_AppJava.HR_App;

//THIS IS A DRAFT

import javax.swing.*;

public class GUI_Home {
    // Running the GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(WelcomePage::new);
    }

}

class WelcomePage extends JFrame {

    public WelcomePage() {
        // Setting up the frame details
        setTitle("Welcome");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Setting up the panel and panel components
        JPanel panel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("HR_App/HR_App_Logo.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setIcon(new ImageIcon(getClass().getResource("HR_App/HR_App_Logo.png")));

        JButton starButton = new JButton("Start");

        // Adding the action listener for the starButton
        starButton.addActionListener(e -> {
            setVisible(false);/*
                               * new LoginScreen();
                               */
        });

        // panel.add(imageIcon);
        panel.add(imageLabel);
        panel.add(starButton);

        // Allowing up to see the panel
        add(panel);
        setVisible(true);
    }
}
