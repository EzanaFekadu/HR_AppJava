package com.example.HR_AppJava.HR_App;
import java.util.Scanner;
public class Person {
    
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;

    public void setName(){
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();
    }

    public void setAge(){
        System.out.println("Enter age: ");
        this.age = scanner.nextInt();
    }

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
