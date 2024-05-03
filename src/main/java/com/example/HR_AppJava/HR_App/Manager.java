package main.java.com.example.HR_AppJava.HR_App;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements User {
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

  // modifier
  public void setTitle(String t) {
    title = t;
  }

  // accessor
  public String getTitle() {
    return title;
  }

  public List getEvals() {
    return evaluations;
  }

  public List getEmployees() {
    return employees;
  }

  public List getTeams() {
    return teams;
  }

  public List findSkilledEmployees(Skill s) {
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
