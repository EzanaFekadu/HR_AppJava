package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;

public class Evaluations {
    ArrayList<Questions> questions;

    public Evaluations(){
        questions = new ArrayList<>();
    }

    
    public void addQuestion(Questions q) {
        questions.add(q);
    }

    
    public Questions getQuestion(int i) {
        return questions.get(i);
    }

    
    public String getAnswer(int i) {
        return questions.get(i).getResponse();
    }

    public void deleteQuestion(int i){
        questions.remove(i);
    }
}
