package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Job implements Identification {

    Scanner scanner = new Scanner(System.in);
    private String title;
    private int experiance;

    // Constructor
    public Job(String title, int experiance) {
        this.title = title;
        this.experiance = experiance;
    }

    // Modifiers
    public void setTitle() {
        System.out.print("Enter title: ");
        title = scanner.nextLine();
    }

    public void setExperience() {
        System.out.print("Enter experience(in months): ");
        experiance = scanner.nextInt();
    }

    // Accessors
    public String getTitle() {
        return title;
    }

    public int getExperience() {
        return experiance;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Experience: " + experiance);

    }

    private void createID() {
        String id = "J-";

    }
}
