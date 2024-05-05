package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;

public class Manager extends Employee implements User {
  // Instance variables
  private String username;
  private String password;
  private String title;
  private ArrayList<Employee> employees;
  private ArrayList<Team> teams;
  private ArrayList<Evaluations> evaluations;

  // constructor
  public Manager() {
    super();
    username = "";
    password = "";
    title = "";
    employees = new ArrayList<>();
    teams = new ArrayList<>();
    evaluations = new ArrayList<>();
  }

  // modifiers
  public void setTitle(String t) {
    title = t;
  }

  // accessor
  public String getTitle() {
    return title;
  }

  public ArrayList<Evaluations> getEvals() {
    return evaluations;
  }

  public ArrayList<Employee> getEmployees() {
    return employees;
  }

  public ArrayList<Team> getTeams() {
    return teams;
  }

  // Searches the array list of employees to find those that have the skill
  // parameter s
  // If they do have that skill they are added to an ArrayList and then the
  // ArrayList is returned
  public ArrayList<Employee> findSkilledEmployees(Skill s) {
    ArrayList<Employee> employees = new ArrayList<>();

    for (int i = 0; i < employees.size(); i++) {
      if (employees.get(i).getSkills().indexOf(s) > 0) {
        employees.get(i);
      }
    }
    return employees;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  // methods
  public void changePassword(String newPass) {
    password = newPass;
  }

  public void setUsername(String name) {
    username = name;
  }

  public boolean login(String user, String pass) {
    if (user == username && pass == password)
      return true;
    return false;
  }

}
