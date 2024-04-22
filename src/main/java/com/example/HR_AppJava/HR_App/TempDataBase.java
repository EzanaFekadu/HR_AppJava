package com.example.HR_AppJava.HR_App;
//We collaborated on everything together, no one method was done individually.
import java.util.ArrayList;

public class TempDataBase {
    private ArrayList<Object[]> arrays;

    public TempDataBase() {
        arrays = new ArrayList<>();
    }

    // add items
    public void addItem(int listIndex, Object obj) {
        // Check to see if listIndex is in bounds
        if (listIndex >= 0 && listIndex < arrays.size()) {

            // gets next null/empty position in array method will return -1 if there isn't
            // an empty spot in the array
            int nullIndex = checkArray(listIndex);

            // if there is an empty spot add the object into it
            if (nullIndex > -1) {
                arrays.get(listIndex)[nullIndex] = obj;

                // if there isn't an empty spot, create a bigger array and re-get the empty
                // position and put the object into it
            } else {
                enlargeArray(listIndex);
                nullIndex = checkArray(listIndex);
                arrays.get(listIndex)[nullIndex] = obj;
            }
        } else {
            System.out.println("Array index out of bounds");
        }
    }

    // Method to edit an item in an array
    public void editItem(int listIndex, int itemIndex, Object newItem) {
        // checking to ensure listIndex is in bounds

        if (listIndex >= 0 && listIndex < arrays.size()) {

            // checking to ensure itemIndex is in bounds then replaces the old item with the
            // new item
            if (itemIndex >= 0 && itemIndex < arrays.get(listIndex).length) {
                arrays.get(listIndex)[itemIndex] = newItem;
            } else {
                System.out.println("Item index out of bounds");
            }
        } else {
            System.out.println("Array index out of bounds");
        }
    }

    // method to remove an object from an array
    public void removeItem(int listIndex, int itemIndex) {
        // checking to ensure listIndex is in bounds
        if (listIndex >= 0 && listIndex < arrays.size()) {
            // checking to ensure itemIndex is in bounds
            if (itemIndex >= 0 && itemIndex < arrays.get(listIndex).length) {
                Object[] tempArr = new Object[arrays.get(listIndex).length - 1];
                // get first part of array before removed item
                for (int newIndex = 0; newIndex < itemIndex; newIndex++) {
                    tempArr[newIndex] = arrays.get(newIndex);
                }

                // get second part of array after removed item
                for (int newIndex = itemIndex; newIndex < tempArr.length; newIndex++) {
                    tempArr[newIndex] = arrays.get(newIndex + 1);
                }

                // set original array equal to new array aka tempArr
                arrays.set(listIndex, tempArr);
            } else {
                System.out.println("Item index out of bounds");
            }
        } else {
            System.out.println("Array index out of bounds");
        }
    }

    private void enlargeArray(int listIndex) {
        //assign the length of the array we want to enlarge to the oldSize variable 
        int oldSize = arrays.get(listIndex).length;
        //create a new array with double the size of the old one
        Object[] newArray = new Object[2 * oldSize];
        //assign each element of the old array to the new one
        for (int i = 0; i < oldSize; i++) {
            newArray[i] = arrays.get(listIndex)[i];
        }
        //replace the old array with the new one
        arrays.set(listIndex, newArray);
    }

    private int checkArray(int index) {

        // sets the array in arrays to tempArr
        Object[] tempArr = arrays.get(index);
        int x = -1;

        // loop to check for next empty value
        for (int i = 0; i < tempArr.length; i++) {
            // if the spot is null aka empty then x or the return value is set to that spot
            // and break from loop
            if (tempArr[i] == null) {
                x = i;
                break;
            }
        }
        return x;
    }

    // Method to read all the items in an array
    public void readItemsInArray(int listIndex) {
        if (listIndex >= 0 && listIndex < arrays.size()) {
            Object[] array = arrays.get(listIndex);
            //print out the items in the array
            System.out.print("Items in array " + (listIndex + 1) + ": ");
            for (Object item : array) {//goes through every item
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.out.println("Array index out of bounds");
        }
    }

    // Method to add a new array
    public void addArray(Object[] newArray) {
        arrays.add(newArray);
    }

    // Method to delete an array
    public void deleteArray(int listIndex) {
        arrays.remove(listIndex);
    }

    
}
