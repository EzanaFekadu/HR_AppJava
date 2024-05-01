package com.example.HR_AppJava.HR_App;

import javax.swing.*;

import java.awt.*;

public class GUI_Login {
    public static void main(String[] args) {

        /*
         * Manager one = new Manager();
         * one.setUsername("bob.smith@company.com");
         * one.changePassword("catsAreCool");
         * 
         * Manager two = new Manager();
         * two.setUsername("mary.shelly@company.com");
         * two.changePassword("dogsRock");
         * 
         * Manager[] managers = new Manager[2];
         * managers[0] = one;
         * managers[1] = two;
         * 
         * new LoginScreen(managers);
         * 
         * SwingUtilities.invokeLater(() -> new LoginScreen(managers));
         */

    }
}

class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private Object[] managers;

    public LoginScreen(Object[] mans) {
        Object[] managers = mans;
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            for (int i = 0; i < managers.length; i++) {
                if (username.equals(managers[i])) {
                    if (password.equals(managers[i])) {
                        setVisible(false);
                        new UserInfoFrame();
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Invalid username or password", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
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

class UserInfoFrame extends JFrame {
    public UserInfoFrame() {
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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
        setVisible(true);
    }

}
