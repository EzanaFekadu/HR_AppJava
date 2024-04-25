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

                    /*
                     * // Draw sun
                     * g2d.setColor(Color.YELLOW);
                     * g2d.fillOval(50, 50, 100, 100);
                     * 
                     * // Draw sun rays
                     * g2d.setColor(Color.BLUE);
                     * for (int i = 0; i < 360; i += 45) {
                     * double radian = Math.toRadians(i);
                     * int x1 = 100 + (int) (Math.cos(radian) * 50);
                     * int y1 = 100 + (int) (Math.sin(radian) * 50);
                     * int x2 = 100 + (int) (Math.cos(radian) * 80);
                     * int y2 = 100 + (int) (Math.sin(radian) * 80);
                     * g2d.drawLine(x1, y1, x2, y2);
                     * }
                     * 
                     * // Draw smiley face
                     * g2d.setColor(Color.YELLOW);
                     * g2d.fillOval(75, 75, 50, 50);
                     * g2d.setColor(Color.BLUE);
                     * g2d.drawArc(80, 90, 40, 20, -180, 180);
                     * 
                     * // Draw Eyes on the Sun
                     * g2d.drawOval(84, 70, 10, 20);
                     * g2d.fillOval(84, 70, 10, 20);
                     * g2d.drawOval(105, 70, 10, 20);
                     * g2d.fillOval(105, 70, 10, 20);
                     * 
                     * // Draw a square House to the bottom right of the sun
                     * g2d.setColor(Color.GRAY);
                     * g2d.drawRect(200, 200, 50, 50);
                     * g2d.fillRect(200, 200, 50, 50);
                     * g2d.setColor(Color.RED);
                     * g2d.drawLine(200, 200, 225, 175);
                     * g2d.drawLine(225, 175, 250, 200);
                     * 
                     * // Draw red door
                     * g2d.drawRect(220, 235, 10, 15);
                     * 
                     * // Draw door outline
                     * 
                     * // draw logo
                     */
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