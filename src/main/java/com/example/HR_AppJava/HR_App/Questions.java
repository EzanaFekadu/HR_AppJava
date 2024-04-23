package com.example.HR_AppJava.HR_App;
import java.util.Scanner;
public class Questions {
    Scanner scanner = new Scanner(System.in);
    
    private String question;
    private String response;

    public Questions(){
        question = "";
        answer="";
    }

    public void enterResponse(String r){
        response = r;
    }

    public String getAnswer(){
        return response;
    }

    public String getQuestion(int i){
        return questions[i];
    }
    
    public String toString(){
        return question + "\t " + response;
    }
}
