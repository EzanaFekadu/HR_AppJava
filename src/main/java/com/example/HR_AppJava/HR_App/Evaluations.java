package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;

public class Evaluations {
    // Instance variables -> list of Questions
    ArrayList<Questions> questions;

    // Constructor
    public Evaluations() {
        questions = new ArrayList<>();
    }

    // setters
    public void addQuestion(Questions q) {
        questions.add(q);
    }

    // getters
    public Questions getQuestion(int i) {
        return questions.get(i);
    }

    public String getAnswer(int i) {
        return questions.get(i).getResponse();
    }

    // Removes a question in position i from the list
    public void deleteQuestion(int i) {
        questions.remove(i);
    }
}
