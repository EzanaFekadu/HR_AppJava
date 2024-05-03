public class ArrayOfArrays {
    private Object[][] arrayOfArrays;

    public ArrayOfArrays() {
        // Creating an array of arrays of objects
        this.arrayOfArrays = new Object[5][];
        
        // Initializing each array object within the main array
        this.arrayOfArrays[0] = new Integer[]{1, 2, 3};
        this.arrayOfArrays[1] = new Integer[]{4, 5, 6, 7};
        this.arrayOfArrays[2] = new Object[]{new Integer[]{8, 9, 10}, new Integer[]{11, 12}, new Integer[]{13, 14, 15}};
        this.arrayOfArrays[3] = new Integer[]{16};
        this.arrayOfArrays[4] = new Integer[]{17, 18, 19};
    }

    public void printArrays() {
        // Printing the contents of the array of arrays
        for (int i = 0; i < this.arrayOfArrays.length; i++) {
            System.out.print("Array " + i + ": ");
            if (this.arrayOfArrays[i] instanceof Integer[]) {
                for (int j = 0; j < ((Integer[]) this.arrayOfArrays[i]).length; j++) {
                    System.out.print(((Integer[]) this.arrayOfArrays[i])[j] + " ");
                }
            } else if (this.arrayOfArrays[i] instanceof Object[]) {
                for (int j = 0; j < ((Object[]) this.arrayOfArrays[i]).length; j++) {
                    Integer[] innerArray = (Integer[]) ((Object[]) this.arrayOfArrays[i])[j];
                    for (int k = 0; k < innerArray.length; k++) {
                        System.out.print(innerArray[k] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}