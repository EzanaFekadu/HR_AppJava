package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;
import java.util.List;

public class Project {
    // Instance Variables
    private boolean completed;
    private ArrayList<Skill> requiredSkills;
    private int projectId;

    // constructors
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

    // Checks to see if a skill is on the required skills list
    public String checkSkill(Skill skill) {
        boolean exists = requiredSkills.contains(skill);
        if (exists) {
            return "";
        } else {
            return "Doesn't meet the skill requirement.";

        }
    }

    // modifiers
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

    public void updateCompletion() {
        completed = true;
    }
}
