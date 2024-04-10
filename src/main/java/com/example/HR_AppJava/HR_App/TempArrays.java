package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;

public class TempArrays {
    //ArrayList<Skill> skills = new ArrayList<>();//Isabella
    ArrayList<String> questions = new ArrayList<String>();//Ezana-Ethan
    static ArrayList<String> names = new ArrayList<String>();//Isabella
    ArrayList<String> addresses = new ArrayList<>();//Isabella
    //ArrayList<Teams> teams = new ArrayList<>();//Ezana
    ArrayList<String> jobs = new ArrayList<>();//Jobs
    //ArrayList<Employee> employees = new ArrayList<>();
    //ArrayList<Manager> users = new ArrayList<>();
    //ArrayList<project> projects = new ArrayList<>();//Ezana

    public static void addNames(String s){
        names.add(s);
    }
    public void editName(int i, String name){
        names.set(i, name);
    }
    public void deleteName(int i){
        names.remove(i);
    }
    public static String getName(int i){
        return names.get(i);
    }

    public static void main(String[] args) {
        TempArrays.addNames("I");
        TempArrays.getName(0);
    }

    
}

