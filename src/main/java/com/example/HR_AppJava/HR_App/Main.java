package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);    
    static Person p1 = new Person();
    static Job j1 = new Job();
    static HardSkill s1 = new HardSkill();
    public static void main(String[] args) {
        
        System.out.println("--- Person Details ---");

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());

        System.out.println("--- Jobs ---");

        System.out.println("Title: " + j1.getTitle());
        System.out.println("Experience: " + j1.getExperience() + " months");


        System.out.println("--- Hard Skills ---");

        System.out.println("Title: " + s1.getTitle());
        System.out.println("Level: " + s1.getLevel());

    }
    
}