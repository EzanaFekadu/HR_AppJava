package com.example.HR_AppJava.HR_App;

import java.util.ArrayList;

public class TempDataBase {
    private ArrayList<Object[]> arrays;

    public TempDataBase() {
        arrays = new ArrayList<Object[]>();
    }

    // add items
    public void addItem(int listIndex, Object obj) {
        if (listIndex >= 0 && listIndex < arrays.size()) {
            // Object[] array=arrays.get(listIndex);
            int nullIndex = checkArray(listIndex);
            if (nullIndex > -1) {
                arrays.get(listIndex)[nullIndex] = obj;
            } else {
                enlargeArray(listIndex);
                nullIndex = checkArray(listIndex);
                arrays.get(listIndex)[nullIndex] = obj;
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to edit an item in an array
    public void editItemInArray(int listIndex, int itemIndex, Object newItem) {
        // checking to ensure listIndex is in bounds
        if (listIndex >= 0 && listIndex < arrays.size()) {
            // checking to ensure itemIndex is in bounds
            if (itemIndex >= 0 && itemIndex < arrays.get(listIndex).length) {
                arrays.get(listIndex)[itemIndex] = newItem;
            } else {
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
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
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    private void enlargeArray(int listIndex) {
        int oldSize = arrays.get(listIndex).length;
        Object[] newArray = new Object[2 * oldSize];

        for (int i = 0; i < oldSize; i++) {
            newArray[i] = arrays.get(listIndex)[i];
        }

        arrays.set(listIndex, newArray);
    }

    private int checkArray(int index) {
        Object[] tempArr = arrays.get(index);
        int x = -1;

        for (int i = 0; i < tempArr.length; i++) {
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
            System.out.print("Items in array " + listIndex + ": ");
            for (Object item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.err.println("Array index out of bounds");
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
