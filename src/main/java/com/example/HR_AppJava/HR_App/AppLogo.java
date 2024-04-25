package com.example.HR_AppJava.HR_App;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class AppLogo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel canvas = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g;

                    g2d.setColor(Color.GRAY);

                    g2d.fillRect(50, 50, 100, 215);

                    g2d.fillRect(99, 0, 2, 50);
                    g2d.setColor(Color.CYAN);

                    for (int i = 60; i < 230; i += 20) {
                        for (int j = 55; j < 150; j += 20) {

                            g2d.fillRect(j, i, 10, 10);
                        }
                    }
                    g2d.setColor(Color.RED);
                    g2d.fillRect(95, 240, 10, 25);

                }
            };

            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}