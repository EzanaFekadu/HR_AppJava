import java.util.ArrayList;
public class Team{
  //properties
  private ArrayList<Employee> members;
  private ArrayList<Skill> skills;
  private Project projects;
  private int teamId;
  //constructor
  public Team(){
    members = new ArrayList<>();
    skills = new ArrayList<>();
    projects = new Project;
    teamId = 1000;
  }
  public Team(int id, Project proj, ArrayList<Employee> emp, ArrayList<Skill> s){
    members = emp;
    skills = s;
    projects = proj;
    teamId = id;
  }
   //methods
  public void addMember(Employee emp){
    members.add(emp);
  }
  public void removeMember(Employee emp){
    int indexEmp = members.indexOf(emp);
    members.remove(indexEmp);
  }
  public void assignProject(Project proj){
    project = proj;
  }
  //modifier
  public void setTeamId( int Id){
    teamId = Id;
  }
  //accessor
  public int getId(){
    return teamId;
  }
}
