package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Person {
    
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Modifiers
    public void setName(){
        System.out.print("Enter name: ");
        name = scanner.nextLine();
    }
    public void setAge(){
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    //Accessors
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
