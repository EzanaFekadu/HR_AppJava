package com.example.HR_AppJava.HR_App;

//THIS IS A DRAFT/SAMPLE CODE
//look into change event instead of click event

import java.awt.*;
import javax.swing.*;
import javax.swing.JComboBox;

public class SearchPage extends JFrame {
    // Instance Variables
    private JComboBox<String> dropdown;
    private JTextField searchBox;
    private JButton searchButton;

    public SearchPage() {
        // Setting up frame details
        setTitle("Search Page");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Setting up categories
        String[] searchOptions = { "Names", "Teams", "Departments" };
        dropdown = new JComboBox<>(searchOptions);
        add(dropdown);

        // Setting up text field to input what is being searched
        searchBox = new JTextField(20);
        add(searchBox);

        // Setting up button
        searchButton = new JButton("Search");

        // Setting up the action listener for the button
        searchButton.addActionListener(e -> {
            String selectedOption = (String) dropdown.getSelectedItem();
            String searchText = searchBox.getText();
            // Perform search based on selected option and search text
            System.out.println("Searching for " + searchText + " in " + selectedOption);
        });
        add(searchButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Calling the GUI
        SwingUtilities.invokeLater(() -> new SearchPage());
    }
}
