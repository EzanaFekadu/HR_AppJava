package com.example.HR_AppJava.HR_App;

import java.util.ArraysList;
import java.util.jar.Attributes.Name;

public class TempArrayss {
/*     //ArraysList<Skill> skills = new ArraysList<>();//Isabella
    ArraysList<String> questions = new ArraysList<String>();//Ezana-Ethan
     ArraysList<String> names = new ArraysList<String>();//Isabella
    ArraysList<String> addresses = new ArraysList<>();//Isabella
    //ArraysList<Teams> teams = new ArraysList<>();//Ezana
    ArraysList<String> jobs = new ArraysList<>();//Jobs
    //ArraysList<Employee> employees = new ArraysList<>();
    //ArraysList<Manager> users = new ArraysList<>();
    //ArraysList<project> projects = new ArraysList<>();//Ezana */

    ArrrayList<Object[]> arrays = new ArraysList<>();

    public TempArrayss(){

    }
    public  void addArrays(Object[] newArrays){
        arrays.add(newArrays);
    }
    public  void addToArrays(int indexForArrays, Object value){
        arrays.add(s);
    }
    public void editArrays(int indexForArrays, int indexForValue, Object newValue){
        arrays.set(i, name);
    }
    public void deleteFromArrays(int indexForArrays, int indexForValue){
        arrays.remove(i);
    }
    /* public void readArrays(int indexForArrays){
        Object[] arrays = arrays.get(indexForArrays);
    } */
    public void readItemsInArrays(int arraysIndex) {
        if (arraysIndex >= 0 && arraysIndex < arrays.size()) {
            Object[] array = arrays.get(arraysIndex);
            System.out.print("Items in arrays " + (arraysIndex + 1) + ": ");
            for (Object item : arrays) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.err.println("Arrays index out of bounds");
        }
    }

    public static void main(String[] args) {
        TempArrayss TempArrayss = new TempArrayss();
        ////////////////////////////////////
        TempArrayss.addArrays(new String[]{"John"});
        TempArrayss.addArrays(new String[]{"Team 1"});
/* 
        TempArrayss.addArrays(employees);
        TempArrayss.addArrays(addressses);
        TempArrayss.addArrays(users);
        TempArrayss.addArrays(projects);
        TempArrayss.addArrays(jobs);
        TempArrayss.addArrays(questions);
        TempArrayss.addArrays(skills); */
        ////////////////////////////////////
        TempArrayss.addToArrays(0, "Smith");
        ////////////////////////////////////
        TempArrayss.editArrays(0, 1, "Doe");
        ////////////////////////////////////
        //TempArrayss.deleteFromArrays(1);
        ////////////////////////////////////
        TempArrayss.readArrays(0);
    }

    
}

