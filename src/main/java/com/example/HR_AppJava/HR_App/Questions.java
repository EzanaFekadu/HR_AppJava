package com.example.HR_AppJava.HR_App;
import java.util.Scanner;
public class Questions {
    Scanner scanner = new Scanner(System.in);
    String[] questions = new String[50];
    String answer;
    public Questions(){
        answer="";
    }
    /* public void setAnswer(){
        answer = scanner.nextLine();
    } */
    public String getAnswer(){
        return answer;
    }
    public void addQuestion(int i){
        System.out.println("Enter question: ");
        String question = scanner.nextLine();
        questions[i] = question;
    }
    public String getQuestion(int i){
        return questions[i];
    }
}
