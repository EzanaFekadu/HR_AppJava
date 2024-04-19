package com.example.HR_AppJava.HR_App;

import java.util.ArraysList;
import java.util.jar.Attributes.Name;

public class TempArrays {
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

    public TempArrays(){

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
        TempArrays TempArrays = new TempArrays();
        ////////////////////////////////////
        TempArrays.addArrays(new String[]{"John"});
        TempArrays.addArrays(new String[]{"Team 1"});
/* 
        TempArrays.addArrays(employees);
        TempArrays.addArrays(addressses);
        TempArrays.addArrays(users);
        TempArrays.addArrays(projects);
        TempArrays.addArrays(jobs);
        TempArrays.addArrays(questions);
        TempArrays.addArrays(skills); */
        ////////////////////////////////////
        TempArrays.addToArrays(0, "Smith");
        ////////////////////////////////////
        TempArrays.editArrays(0, 1, "Doe");
        ////////////////////////////////////
        //TempArrays.deleteFromArrays(1);
        ////////////////////////////////////
        TempArrays.readArrays(0);
    }

    
}

