package com.example.HR_AppJava.HR_App;

import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;

public class GUI_Login {

    public static void main(String[] args) {
        Manager one = new Manager();

        one.setUsername("bob.smith@company.com");

        one.changePassword("catsAreCool");

        Manager two = new Manager();
        two.setUsername("mary.shelly@company.com");
        two.changePassword("dogsRock");

        Manager[] managers = new Manager[2];
        managers[0] = one;
        managers[1] = two;

        SwingUtilities.invokeLater(() -> new LoginScreen(managers));

    }

}

class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private Manager[] managers;

    public LoginScreen(Manager[] mans) {
        // instance variables
        managers = mans; // data
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Page set up
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        // Action Listener for the button to Login
        loginButton.addActionListener(e -> {
            // gets the username and password entered into the respective text fields
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            // boolean to indicate when we find the correct username and password
            boolean found = false;

            // we loop through the data to see if the username and password matches any
            // profiles we have
            for (int i = 0; i < managers.length; i++) {
                if (username.equals(managers[i].getUsername()) && password.equals(managers[i].getPassword())) {
                    // if we find matching data then open a confirmation page
                    found = true;
                    setVisible(false);
                    new LoginSuccess();

                }
            }

            // if no matching data was found then throw the error message
            if (!found) {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }
}

class LoginSuccess extends JFrame {
    public LoginSuccess() {

        // Page details
        setTitle("Login Success");
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Page components
        JPanel panel = new JPanel(new BorderLayout());

        JLabel userInfoLabel = new JLabel("Name: John Doe \nAddress: 123 Main St");
        ImageIcon imageIcon = new ImageIcon("user_image.jpg"); // Replace with actual path to the image
        JLabel imageLabel = new JLabel(imageIcon);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose()); // Close the frame

        panel.add(userInfoLabel, BorderLayout.NORTH);
        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);

        add(panel);

        // display page
        setVisible(true);
    }
}
