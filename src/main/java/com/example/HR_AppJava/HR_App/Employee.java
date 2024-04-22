package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;

public class Employee extends Person {
    private int empID;
    private int currJobID;
    private ArrayList<Job> pastJobs;
    private ArrayList<Evaluations> evaluations;
    private ArrayList<Skill> skills;
    private Job currJob;
    private Team currTeam;
    private int teamID;

    public Employee() {
        super();
        empID = 0;
        currJobID = 0;
        teamID = 0;
        pastJob = new ArrayList<Job>();
        evaluations = new ArrayList<Evaluations>();
        skills = new ArrayList<Skill>();
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

    public void addEval(Evaluation eval) {
        evaluations.add(eval);
    }

    public void swapOldJobForNew(Job job, int jobid) {
        pastJobs.add(currJob);
        currJob = job;
        currJobID = jobid;
    }

    // public void updateExperience(Skill skill, int experience);
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

    public ArrayList<Job> getPastJob() {
        return pastJobs;
    }

    public ArrayList<Evaluations> getEvals() {
        return evaluations;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public Job getCurrJob() {
        return currJob;
    }

    public Team getCurrTeam();

    {
        return currTeam;
    }

}
