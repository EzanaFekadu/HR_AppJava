package com.example.HR_AppJava.HR_App;

//THIS IS A DRAFT/SAMPLE CODE

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeManagementApp {

    private static JComboBox<String> searchDropdown = new JComboBox<>(new String[] { "Name", "Team", "Department" });
    private static JTextField searchField;
    private static JButton searchButton;
    private static JTable employeeTable;
    private static JButton addButton;
    private static JButton editButton;
    private static JButton deleteButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Employee Management");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            // Create components
            searchDropdown = new JComboBox<>(new String[] { "Name", "Team", "Department" });
            searchField = new JTextField(20);
            searchButton = new JButton("Search");
            employeeTable = new JTable(); // needs to be populated with data
            addButton = new JButton("Add");
            editButton = new JButton("Edit");
            deleteButton = new JButton("Delete");

            DefaultTableModel tableModel = new DefaultTableModel();
            JTable employeeTable = new JTable();

            // Layout
            JPanel searchPanel = new JPanel();
            searchPanel.add(searchDropdown);
            searchPanel.add(searchField);
            searchPanel.add(searchButton);

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(addButton);
            buttonPanel.add(editButton);
            buttonPanel.add(deleteButton);

            frame.setLayout(new BorderLayout());
            frame.add(searchPanel, BorderLayout.NORTH);
            frame.add(new JScrollPane(employeeTable), BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            // Action listeners
            searchButton.addActionListener(e -> {
                // Perform search based on selected criteria (Name, Team, or Department)
                String searchText = searchField.getText();
                // TODO: Implement search logic here
                // Update the employeeTable with search results
            });

            addButton.addActionListener(e -> {
                // Show a dialog to add a new employee
                // TODO: Implement add logic here
                showAddEmployeeDialog(tableModel);
            });

            frame.setLayout(new BorderLayout());
            frame.add(new JScrollPane(employeeTable), BorderLayout.CENTER);
            frame.add(addButton, BorderLayout.SOUTH);

            frame.setVisible(true);
            ////////////////////////////////////////////////////////////
            editButton.addActionListener(e -> {
                // Show a dialog to edit an existing employee
                // TODO: Implement edit logic here
            });

            deleteButton.addActionListener(e -> {
                // TODO: Implement delete logic here
            });

            // Show the frame
            frame.setVisible(true);
        });
    }

    private static void showAddEmployeeDialog(DefaultTableModel tableModel) {
        JDialog dialog = new JDialog();
        dialog.setTitle("Add Employee");
        dialog.setSize(300, 150);
        dialog.setModal(true);

        JTextField nameField = new JTextField(20);
        JTextField departmentField = new JTextField(20);
        JButton saveButton = new JButton("Save");

        saveButton.addActionListener(e -> {
            String name = nameField.getText();
            String department = departmentField.getText();
            tableModel.addRow(new Object[] { name, department });
            dialog.dispose();
        });

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Department:"));
        panel.add(departmentField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(saveButton);

        dialog.add(panel);
        dialog.setVisible(true);
    }
}

public class showAddEmployeeDialog {

    // TODO: Add Dialod for add
}

public class showDeleteEmployeeDialog {

    // TODO: Add Dialod for delete
}

public class showEditEmployeeDialog {

    // TODO: Add Dialod for edit
}
