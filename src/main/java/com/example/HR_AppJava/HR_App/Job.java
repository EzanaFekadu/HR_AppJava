package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Job {
    // Instance Variables
    Scanner scanner = new Scanner(System.in);
    private String title;
    private int experience;
    private String department;

    // Constructors
    public Job() {
        title = "";
        department = "";
        experience = 0;
    }

    public Job(String title, String department, int experience) {
        this.title = title;
        this.department = department;
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

    public void setDepartment() {
        System.out.print("Enter department: ");
        department = scanner.nextLine();
    }

    // Accessors
    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Experience: " + experience);
        System.out.println("Department: " + department);

    }
}
