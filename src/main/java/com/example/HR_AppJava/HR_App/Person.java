package com.example.HR_AppJava.HR_App;

//An Image instance variable will need to be added
public abstract class Person {
    // Instance Variables
    private String name;
    private int age;
    private String address;
    /// private BufferedImage picture;
    private String phoneNumber;
    private String email;

    // Constructors
    public Person(String n, int a, String add, String num, String em) {
        name = n;
        age = a;
        address = add;
        phoneNumber = num;
        email = em;
    }

    public Person() {
        name = "";
        age = 0;
        address = "";
        phoneNumber = "";
        email = "";
    }

    // setters
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setAddress(String add) {
        address = add;
    }

    // public void setPicture();
    public void setPhoneNumber(String phone) {
        phoneNumber = phone;
    }

    public void setEmail(String e) {
        email = e;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    /// public BufferedImage getImage();
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

}
