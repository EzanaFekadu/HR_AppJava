package com.example.HR_AppJava.HR_App;

public abstract class Person {
    // Instance Variables
    private String name;
    private String address;
    /// private BufferedImage picture;
    private String phoneNumber;
    private String email;

    public Person(String n, String add, String num, String em) {
        name = n;
        address = add;
        phoneNumber = num;
        email = em;
    }

    public Person() {
        name = "";
        address = "";
        phoneNumber = "";
        email = "";
    }

    // setters
    public void setName(String n) {
        name = n;
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
