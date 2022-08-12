package homework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String input = scanner.nextLine().trim().toLowerCase().replaceAll(" ","");
        boolean isPalindrome = true;

        //(userInput.substring(i,i+1) != userInput.substring(userInput.length() - 2 - i,userInput.length() - 1 - i))


        for(int i = 0; i < input.length()/2; i++){

//            if(i == 0){
//                if(input.substring(i,i+1) != input.substring(input.length()-1)){
//                    isPalindrome = false;
//                    break;
//                }
//            } else {
//                if(input.substring(i,i+1) != input.substring(input.length() - 1 - i,input.length()  - i)){
//                    isPalindrome = false;
//                    break;
//                }
//            }
           // System.out.println(input.substring(i,i+1) + " and " + input.substring(input.length() - 2 - i,input.length() - 1 - i) );

            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.printf("Your input %s is a palindrome \n", input);
        }else {
            System.out.printf("Your input %s is not a palindrome \n", input);
        }




    }
}
