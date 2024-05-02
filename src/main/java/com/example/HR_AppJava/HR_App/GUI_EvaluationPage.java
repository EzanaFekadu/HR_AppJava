package main.java.com.example.HR_AppJava.HR_App;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI_EvaluationPage {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EvalPage());

    }
}

class EvalPage extends JFrame {
    // instance variable -> stores the text gathered from the responseFields
    private ArrayList<JTextField> responseFields = new ArrayList<>();

    public EvalPage() {
        // Set up the page settings
        setTitle("Evaluation");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Page components
        JPanel panel = new JPanel(new GridLayout(6, 2));
        JLabel question1 = new JLabel("How would you rate your productivity?");
        JLabel question2 = new JLabel("How is your workspace environment?");
        JLabel question3 = new JLabel("Is your team getting along?");
        JLabel question4 = new JLabel("Is the project coming to terms well?");
        JLabel question5 = new JLabel("How is your mental health doing?");
        JButton submitButton = new JButton("Submit");
        submitButton.setSize(20, 20);

        // Adding the text field to the arrayList
        responseFields.add(new JTextField());
        responseFields.add(new JTextField());
        responseFields.add(new JTextField());
        responseFields.add(new JTextField());
        responseFields.add(new JTextField());

        // Action Listener for when the submitButton is pressed
        submitButton.addActionListener(e -> {
            // records if all textfields are filled out
            boolean allAnswered = true;

            // loops through text fields and ensure there is text input from user
            for (int i = 0; i < responseFields.size(); i++) {
                if ((responseFields.get(i).getText().equals(""))) {
                    allAnswered = false;
                }
            }

            // if all text fields are filled out -> display completion page
            // and if they are not -> display completion error page
            if (allAnswered) {
                setVisible(false);
                new submissionPage();
            } else {
                setVisible(false);
                new submissionErrorPage();
            }
        });

        // Add all page componets to page -> spaces indicate when a new row begins
        panel.add(question1);
        panel.add(responseFields.get(0));

        panel.add(question2);
        panel.add(responseFields.get(1));

        panel.add(question3);
        panel.add(responseFields.get(2));

        panel.add(question4);
        panel.add(responseFields.get(3));

        panel.add(question5);
        panel.add(responseFields.get(4));

        panel.add(new JLabel());
        panel.add(submitButton);

        // finally display the page
        add(panel);
        setVisible(true);
    }
}

class submissionPage extends JFrame {
    public submissionPage() {
        // page details
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // page components
        JPanel panel = new JPanel(new BorderLayout());
        JLabel submitLabel = new JLabel("Evaluation successfully submitted!");
        JButton closeButton = new JButton("Close");

        // Action Listener for the closeButton to close the frame
        closeButton.addActionListener(e -> dispose());

        // Add components to page
        panel.add(submitLabel, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);

        // display page
        add(panel);
        setVisible(true);
    }

}

class submissionErrorPage extends JFrame {
    public submissionErrorPage() {
        // page details
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Page components
        JPanel panel = new JPanel(new BorderLayout());
        JLabel submitLabel = new JLabel("Evaluation not submitted, looks like something is missing.");

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> {
            dispose(); // Close the frame
            new EvalPage();
        });

        // add components to page
        panel.add(submitLabel, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);

        //
        add(panel);
        setVisible(true);
    }

}