package homework;

import java.util.Scanner;

public class PrintoutNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");

        int input = scanner.nextInt();

        if(input >= 0){
            for (int i = input; i >= 0; i--){
                System.out.print(i + " ");
            }
        }else {
            for (int i = input; i <= 0; i++){
                System.out.print(i + " ");
            }
        }
    }
}
