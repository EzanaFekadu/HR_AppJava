package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

//Testing out certain classes 
//This file is null and void due to modification to certain classes
public class Main {
    Scanner scanner = new Scanner(System.in);
    static Person p1 = new Person("John Doe", 25, "123 Smtih Lane", "111-111-1111", "jdoe@company.com");
    static Job j1 = new Job("Chief Engineer", 62);
    static HardSkill s1 = new HardSkill("Coding in Python", "Expert");

    public static void main(String[] args) {
        // Output
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