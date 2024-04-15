package com.example.HR_AppJava.HR_App;

public class Evaluations extends Questions{
    String[] questions;

    @Override
    public void addQuestion(int i) {
        // TODO Auto-generated method stub
        System.out.println("Enter question: ");
        String question = scanner.nextLine();
        questions[i] = question;
        //super.addQuestion(i);
    }

    @Override
    public String getQuestion(int i) {
        // TODO Auto-generated method stub
        return questions[i];
        //return super.getQuestion(i);
    }

    @Override
    public String getAnswer() {
        // TODO Auto-generated method stub
        return super.getAnswer();
    }

    public static void main(String[] args) {
        Questions questionsObj = new Questions();
        int i = 0;
        questionsObj.addQuestion(i);
        System.out.println("Return");
        questionsObj.getQuestion(i);
        System.out.println("Done");
        
    }
}
