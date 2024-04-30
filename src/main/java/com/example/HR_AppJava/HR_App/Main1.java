package com.example.HR_AppJava.HR_App;

import javax.swing.*;

import java.awt.*;
import javax.swing.SwingUtilities;

public class Main1 {
    public static void main(String[] args) {
        TempDataBase dataBase = new TempDataBase();
        Manager one = new Manager();
        one.setUsername("bob.smith@company.com");
        one.changePassword("catsAreCool");

        Manager two = new Manager();
        two.setUsername("mary.shelly@company.com");
        two.changePassword("dogsRock");

        Manager[] managers = new Manager[2];
        dataBase.addArray(dataBase.getArray(0));
        managers[0] = one;
        managers[1] = two;

        SwingUtilities.invokeLater(() -> {
            new LoginScreen(managers);
        });
    }
}
