package lecture;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {

        System.out.println("Enter the required size of the array :: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        float myArray[] = new float [size];
        float sum = 0;

        System.out.println("Enter the grades of the array one by one ");

        for(int i=0; i<size; i++){
            System.out.println("Please enter grade number: " + (i+1));
            myArray[i] = scanner.nextFloat();
            sum += myArray[i];
        }

        System.out.println("Average grade: " + sum/myArray.length);
        System.out.println("There was passed " + myArray.length + " values");

    }
}
