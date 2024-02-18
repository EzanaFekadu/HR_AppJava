package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);    

    public static void main(String[] args) {
        
        Person p1 = new Person();
        Job j1 = new Job();
        HardSkill s1 = new HardSkill();

        System.out.println("--- Person Details ---");

        p1.setName();
        p1.setAge();

        System.out.println("--- Jobs ---");

        j1.setTitle();
        j1.setExperience();

        System.out.println("--- Hard Skills ---");

        s1.setTitle();
        s1.setLevel();
    }
    
}
