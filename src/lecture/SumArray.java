package lecture;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        System.out.println("Enter the required size of the array :: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;

        int myArray[] = new int [size];

        System.out.println("Enter the elements of the array one by one ");

        for(int i = 0; i < size; i++ ){
            System.out.println("Please enter element number: " + (i+1));
            myArray[i] = scanner.nextInt();
            sum += myArray[i];
        }

        System.out.print("Source Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        System.out.println("Sum of all elements : " + sum);


    }
}
