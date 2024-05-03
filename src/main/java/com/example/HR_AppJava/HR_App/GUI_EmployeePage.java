package main.java.com.example.HR_AppJava.HR_App;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUI_EmployeePage extends JFrame {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Employee page");
        JPanel panel = new JPanel();
        
        frame.setSize(400, 300); // Set the window size
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create a JTable with sample data
        String[] columnNames = { "Name", "Age", "Address" };
        Object[][] rowData = {
                { "Alice", 25, "123 Main Street" },
                { "Bob", 30, "123 Second Street" },
                { "Charlie", 22, "123 Third Street" },
                { "Alice", 25, "123 Main Street" },
                { "Bob", 30, "123 Second Street" },
                { "Charlie", 22, "123 Third Street" },
                { "Alice", 25, "123 Main Street" },
                { "Bob", 30, "123 Second Street" },
                { "Charlie", 22, "123 Third Street" },
                { "Alice", 25, "123 Main Street" },
                { "Bob", 30, "123 Second Street" },
                { "Charlie", 22, "123 Third Street" },
                { "Alice", 25, "123 Main Street" },
                { "Bob", 30, "123 Second Street" },
                { "Charlie", 22, "123 Third Street" },
                { "Alice", 25, "123 Main Street" },
                { "Bob", 30, "123 Second Street" },
                { "Charlie", 22, "123 Third Street" },
                { "Alice", 25, "123 Main Street" },
                { "Bob", 30, "123 Second Street" },
                { "Charlie", 22, "123 Third Street" }
        };

        JTable table = new JTable(new DefaultTableModel(rowData, columnNames));

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }

}
