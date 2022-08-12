package homework;

import java.util.Arrays;

public class MinMaxMethods {
    public static void main(String[] args) {

        int [] my_array = {10,243,64,23,2,5345,234,54,4,46,600};
        System.out.println("Original array: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array: " + max(my_array));
        System.out.println("Minimum value for the above array: " + min(my_array));

    }

    public static int max(int [] array){
        int max = array[0];
        for (int i = 1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int [] array){
        int min = array[0];
        for (int i = 1; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


}
