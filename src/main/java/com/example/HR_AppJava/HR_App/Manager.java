
import java.util.ArrayList;
import java.util.List;

import com.example.HR_AppJava.HR_App.Employee;
import com.example.HR_AppJava.HR_App.Evaluations;
import com.example.HR_AppJava.HR_App.User;

public class Manager extends Employee implements User {
  private String username;
  private String password;
  private String title;
  ArrayList<Employee> employees;
  ArrayList<Team> teams;
  ArrayList<Evaluation> evaluations;

  //constructor
  public Manager(){
    username = "";
    password = "";
    title = "";
    employees = new ArrayList<>();
    teams = new ArrayList<>();
    evaluations = new ArrayList<>();
  }

  //modifier
  public void setTitle(String t){
    title = t;
  }

  //accessor
  public String getTitle(){
    return title;
  }

  public List getEvals(){
    return evaluations;
  }

  public List getEmployees(){
    return employees;
  }

  public List getTeams(){
    return teams;
  }

  public List findSkilledEmployees(Skill s){
    ArrayList<> employee = new ArrayList<>();

    for (int i = 0; i < employees.size(); i++) {
      if(employees.get(i).getSkills().indexOf(s) > 0){
        employees.get(i);
      }
    }
    return employee;
  }

  //methods
  public void changePassword(String newPass){
    password = newPass;
  }
  
  public boolean login(String user, String pass){
    if(user == username && pass == password)
      return true;
    return false;
  }
}
