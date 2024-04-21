package main.java.com.example.HR_AppJava.HR_App;

public class TempArray {

    private Object[][] tempArray;

    public TempArray(){
        this.tempArray = new Object[6][];

        //the following arrays will hold the ids
        this.tempArray[0] = new Integer[]{1};
        this.tempArray[1] = new Integer[]{2};
        this.tempArray[2] = new Integer[]{3};
        this.tempArray[3] = new Integer[]{4};
        this.tempArray[4] = new Integer[]{5};
        this.tempArray[5] = new Integer[]{6};
    }

    //Methods
    public void add(int arrayIndex,int elementIndex, Object element){
        if (0 <= arrayIndex && arrayIndex< tempArray.length) {
            if (0 <= elementIndex && elementIndex < tempArray[arrayIndex].length) {
                
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }
    public void edit(){}

    public void delete(){}

    public void print(){
        for (int i = 0; i < tempArray.length; i++) {
            System.out.print("Array" + (i + 1) + ":");

            if (this.tempArray[i] instanceof Integer[]) {
                for (int j = 0; j < ((Integer[])this.tempArray[i]).length; j++) {
                    System.out.print(((Integer[])this.tempArray[i])[j] + " ");
                }
            } else if (this.tempArray[i] instanceof Object[]){
                for (int j = 0; j < ((Object[])this.tempArray[i]).length; j++) {
                    Integer[] innerArray = (Integer[])((Object[])this.tempArray[i])[j];
                    for (int k = 0; k < innerArray.length; k++) {
                        System.out.print(innerArray[k] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TempArray tempArray = new TempArray();

        tempArray.print();
    }

}