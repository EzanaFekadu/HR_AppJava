package com.example.HR_AppJava.HR_App;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI_EvaluationPage {
    public static void main(String[] args) {
        new EvalPage();
    }
}

class EvalPage extends JFrame {
    private ArrayList<JTextField> responseFields = new ArrayList<JTextField>();

    public EvalPage() {
        setTitle("Evaluation");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        JLabel question1 = new JLabel("How would you rate your productivity?");
        JLabel question2 = new JLabel("How is your workspace environment?");
        JLabel question3 = new JLabel("Is your team getting along?");
        JLabel question4 = new JLabel("Is the project coming to terms well?");
        JLabel question5 = new JLabel("How is your mental health doing?");

        responseFields.add(new JTextField());
        responseFields.add(new JTextField());
        responseFields.add(new JTextField());
        responseFields.add(new JTextField());
        responseFields.add(new JTextField());

        JButton submitButton = new JButton("Submit");
        submitButton.setSize(20, 20);

        submitButton.addActionListener(e -> {
            System.out.println(responseFields.get(0).getText());
            boolean allAnswered = true;
            for (int i = 0; i < responseFields.size(); i++) {
                if ((responseFields.get(i).getText().equals(""))) {
                    allAnswered = false;
                }
            }
            if (allAnswered) {
                setVisible(false);
                new submissionPage();
            } else {
                setVisible(false);
                new submissionErrorPage();
            }
        });

        panel.add(question1);
        // panel.add(new JLabel());
        panel.add(responseFields.get(0));
        // panel.add(new JLabel());

        panel.add(question2);
        // panel.add(new JLabel());
        panel.add(responseFields.get(1));
        // panel.add(new JLabel());

        panel.add(question3);
        // panel.add(new JLabel());
        panel.add(responseFields.get(2));
        // panel.add(new JLabel());

        panel.add(question4);
        // panel.add(new JLabel());
        panel.add(responseFields.get(3));
        // panel.add(new JLabel());

        panel.add(question5);
        // panel.add(new JLabel());
        panel.add(responseFields.get(4));

        panel.add(new JLabel());
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }
}

class submissionPage extends JFrame {
    public submissionPage() {
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel submitLabel = new JLabel("Evaluation successfully submitted!");

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> {
            dispose(); // Close the frame
        });

        panel.add(submitLabel, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

}

class submissionErrorPage extends JFrame {
    public submissionErrorPage() {
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel submitLabel = new JLabel("Evaluation not submitted, looks like something is missing.");

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> {
            dispose(); // Close the frame
            new EvalPage();
        });

        panel.add(submitLabel, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

}