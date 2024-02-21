package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Job {

    Scanner scanner = new Scanner(System.in);

    private String title;
    private int experiance;

    public Job(){
        setTitle( title);
        setExperience(experiance);
    }

    public void setTitle(String title){
        System.out.print("Enter title: ");
        this.title = scanner.nextLine();
    }

    public void setExperience(int experiance){
        System.out.print("Enter experience(in months): ");
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
