package com.example.HR_AppJava.HR_App;

import java.util.Scanner;

public class Questions {
    // Instance Variables
    Scanner scanner = new Scanner(System.in);
    private String question;
    private String response;

    // Constructor
    public Questions() {
        question = "";
        response = "";
    }

    // Setters
    public void enterResponse(String r) {
        response = r;
    }

    public String getResponse() {
        return response;
    }

    // Getters
    public String getQuestion(int i) {
        return question;
    }

    public String toString() {
        return question + "\t " + response;
    }
}
