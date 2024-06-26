package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;
import java.util.List;

//Subclass
public class Employee extends Person {

    // Instance classes
    private int empID;
    private int currJobID;
    private ArrayList<Job> pastJobs;
    private ArrayList<Evaluations> evaluations;
    private ArrayList<Skill> skills;
    private Job currJob;
    private Team currTeam;

    // Base Constructor
    public Employee() {
        super();
        empID = 0;
        currJobID = 0;
        pastJobs = new ArrayList<Job>();
        evaluations = new ArrayList<>();
        skills = new ArrayList<>();
        currJob = new Job();
        currTeam = new Team();
    }

    // setters
    public void setEmpId(int id) {
        empID = id;
    }

    public void setCurrJobID(int id) {
        currJobID = id;
    }

    public void addPastJob(Job j) {
        pastJobs.add(j);
    }

    public void addEval(Evaluations eval) {
        evaluations.add(eval);
    }

    public void swapOldJobForNew(Job job, int jobid) {
        pastJobs.add(currJob);
        currJob = job;
        currJobID = jobid;
    }

    // Finds the skill and then increases the experience of that skill in the
    // ArrayList
    public void updateExperience(Skill skill, int newExperience) {
        int index = skills.indexOf(skill);
        skills.get(index).setLevelOfSkill(newExperience);
    }

    public void setCurrTeam(Team team) {
        currTeam = team;
    }

    // getters
    public int getEmpID() {
        return empID;
    }

    public int getCurrJobID() {
        return currJobID;
    }

    public List<Job> getPastJob() {
        return pastJobs;
    }

    public List<Evaluations> getEvals() {
        return evaluations;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Job getCurrJob() {
        return currJob;
    }

    public Team getCurrTeam() {
        return currTeam;
    }

}
