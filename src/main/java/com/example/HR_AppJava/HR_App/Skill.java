package com.example.HR_AppJava.HR_App;

public class Skill {

    private String title; // What is the skill?
    private String skillType; // What kind of skill is it? A hard skill? Soft skill?
    private int levelOfSkill; // How good are they at the skill?

    // Constructor
    public Skill(String t, String type, int lev) {
        title = t;
        skillType = type;
        levelOfSkill = lev;
    }

    // getters
    public String getSkill() {
        return title;
    }

    public String getSkillType() {
        return skillType;
    }

    public int getSkillLevel() {
        return levelOfSkill;
    }

    // Setters
    public void setSkill(String s) {
        title = s;
    }

    public void setLevelOfSkill(int lev) {
        levelOfSkill = lev;
    }

}
