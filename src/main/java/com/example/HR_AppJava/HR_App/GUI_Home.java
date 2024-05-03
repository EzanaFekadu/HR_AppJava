package main.java.com.example.HR_AppJava.HR_App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Home {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(WelcomePage::new);       
    }
    
}

class WelcomePage extends JFrame {

    public WelcomePage() {
        setTitle("Welcome");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("HR_App/HR_App_Logo.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setIcon(new ImageIcon(getClass().getResource("HR_App/HR_App_Logo.png")));

        JButton starButton = new JButton("Start");

        starButton.addActionListener(e -> {
            setVisible(false);/* 
            new LoginScreen(); */
        });
        frame.add(panel);
        
        //panel.add(imageIcon);
        panel.add(imageLabel);
        panel.add(starButton);

        setVisible(true);
    }
}
