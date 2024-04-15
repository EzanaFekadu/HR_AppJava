package com.example.HR_AppJava.HR_App;

public class Skill {

    private String title; // What is the skill?
    private String skillType; // What kind of skill is it? A hard skill? Soft skill?
    private String levelOfSkill; // How good are they at the skill?

    public Skill(String t, String type, String lev) {
        title = t;
        skillType = type;
        levelOfSkill = lev;
    }

    public String getSkill() {
        return title;
    }

    public void setSkill(String s) {
        title = s;
    }

    public void setLevelOfSkill(String lev) {
        levelOfSkill = lev;
    }

    public String getSkillType() {
        return skillType;
    }

    public String getSkillLevel() {
        return levelOfSkill;
    }

}
