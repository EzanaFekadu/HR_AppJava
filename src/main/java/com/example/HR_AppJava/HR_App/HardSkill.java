package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class HardSkill {

    Scanner scanner = new Scanner(System.in);

    private String title;
    private String level;

    public HardSkill(){
        setTitle(title);
        setLevel(level);
    }

    public void setTitle(String title){
        System.out.print("Enter title(skill): ");
        this.title = scanner.nextLine();
    }
    public void setLevel(String level){
        System.out.print("Enter level: ");
        this.level = scanner.nextLine();
    }
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
