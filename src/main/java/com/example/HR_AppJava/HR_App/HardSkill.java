package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class HardSkill {

    Scanner scanner = new Scanner(System.in);

    private String title;
    private String level;

    //Constructor
    public HardSkill(String title, String level){
        this.title = title;
        this.level = level;
    }

    //Modifiers
    public void setTitle(){
        System.out.print("Enter title(skill): ");
        title = scanner.nextLine();
    }
    public void setLevel(){
        System.out.print("Enter level: ");
        level = scanner.nextLine();
    }

    //Accessors
    public String getTitle(){
        return title;
    }
    public String getLevel(){
        return level;
    }
    
    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Level: " + level);

    }
}
