
import java.util.ArrayList;
import com.example.HR_AppJava.HR_App.Evaluations;
import com.example.HR_AppJava.HR_App.User;

public class Manager implements User{
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
  public ArrayList getEvals(){
    
  }
  public ArrayList getEmployees(){

  }
  public ArrayList getTeams(){

  }
  public void findSkills(int skillId){

  }
  public void getTeamMembers(int teamId){

  }
  public void getEmployeeData(int empId){

  }

  //methods
  public void changePassword(String newPass){
    password = newPass;
  }
  public void manageTeams(int teamId, ArrayList empIds){

  }
  public void employeeEval(int empId, int index){

  }
  public void addEvalTemp(Evaluations eval){
    evaluations.add(eval);
  }


}
