package com.example.HR_AppJava.HR_App;
import java.util.Scanner;
public class HardSkill {
    Scanner scanner = new Scanner(System.in);

    private String title;
    private String level;

    public void setTitle(){
        System.out.println("Enter title: ");
        this.title = scanner.nextLine();
    }
    public void setLevel(){
        System.out.println("Enter level: ");
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
