package homework;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int [] myArray = {1,2,3};
        int [] newArray = new int[myArray.length];


        for(int i = 0; i < myArray.length; i++){
            newArray[i] = myArray[i];
        }

        System.out.println("Source array: " + Arrays.toString(myArray));
        System.out.println("New array: " + Arrays.toString(newArray));

    }
}
