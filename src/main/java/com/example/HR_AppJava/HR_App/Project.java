import java.util.ArrayList;
import java.util.List;

import com.example.HR_AppJava.HR_App.Skill;

public class Project {
    private boolean completed;
    private ArrayList<Skill> requiredSkills;
    private int projectId;

    // constructor
    public Project() {
        completed = false;
        requiredSkills = new ArrayList<>();
        projectId = 2000;
    }

    public Project(ArrayList<Skill> reqSkills, boolean comp, int id) {
        completed = false;
        requiredSkills = reqSkills;
        projectId = id;
    }

    // methods
    public String checkSkill(Skill skill) {
        boolean exists = requiredSkills.contains(skill);
        if (exists) {
            return "";
        } else {
            return "Doesn't meet the skill requirement.";

        }
    }

    // modifier
    public void setId(int id) {
        projectId = id;
    }

    // accessor
    public int getId() {
        return projectId;
    }

    public List<Skill> getRequiredSkills() {
        return requiredSkills;
    }
}
