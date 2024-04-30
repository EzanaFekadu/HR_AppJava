package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Job {

    Scanner scanner = new Scanner(System.in);
    private String title;
    private int experience;

    // Constructors
    public Job() {
        title = "";
        experience = 0;
    }

    public Job(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    // Modifiers
    public void setTitle() {
        System.out.print("Enter title: ");
        title = scanner.nextLine();
    }

    public void setExperience() {
        System.out.print("Enter experience(in months): ");
        experience = scanner.nextInt();
    }

    // Accessors
    public String getTitle() {
        return title;
    }

    public int getExperience() {
        return experience;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Experience: " + experience);

    }
}
