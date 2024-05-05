package com.example.HR_AppJava.HR_App;

//We were attempting to test our tempDataBase to ensure proper functionality

public class TestDataBase {
    public static void main(String[] args) {
        TempDataBase dataBase = new TempDataBase();

        Job newJob = new Job("Engineer", 3);
        Job newJob2 = new Job("Engineer", 1);
        Job newJob3 = new Job("Software Engineer", 5);
        Job newJob4 = new Job("Designer", 2);
        Job newJob5 = new Job("Tester", 1);

        // arrays
        Skill[] skills = new Skill[3];
        Job[] jobs = new Job[4];
        Job[] jobs2 = new Job[1];

        // add the arrays to the list
        dataBase.addArray(jobs);
        dataBase.addArray(skills);
        dataBase.addArray(jobs2);

        // remove the last array
        dataBase.deleteArray(2);

        // add items to the arrays
        dataBase.addItem(0, newJob);
        dataBase.addItem(0, newJob2);
        dataBase.addItem(0, newJob3);
        dataBase.addItem(0, newJob4);
        dataBase.addItem(0, newJob5);

        // read the items in the array
        dataBase.readItemsInArray(0);

        // remove an item in the array
        dataBase.removeItem(0, 1);

        // read the items left in the array
        dataBase.readItemsInArray(0);
    }
}
