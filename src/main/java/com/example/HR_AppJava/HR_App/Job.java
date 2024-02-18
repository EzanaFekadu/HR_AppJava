package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Job {

    Scanner scanner = new Scanner(System.in);

    private String title;
    private int experiance;

    public void setTitle(){
        System.out.println("Enter title: ");
        this.title = scanner.nextLine();
    }

    public void setExperience(){
        System.out.println("Enter experience: ");
        this.experiance = scanner.nextInt();
    }

    public String getTitle(){
        return title;
    }    

    public int getExperience(){
        return experiance;
    }

    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Experience: " + experiance);

    }
}
