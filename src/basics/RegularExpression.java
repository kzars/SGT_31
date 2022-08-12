package basics;

import homework.Palindrome;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("a+bcd");
        Matcher matcher = pattern.matcher("raabcd");

        System.out.println(matcher.matches());
        System.out.println(matcher.find());

        // Any lowercase letter or any number from 5 - 9
        System.out.println(Pattern.matches("[a-z5-9]{3}","568"));


        //basics.Example HP-5742
        //        PO-6235
        //        JR-234
        //        FR-23
        //        KC-2


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car's plate number");
        String plateNumber = scanner.nextLine().trim();

        Pattern pattern1 = Pattern.compile("[a-zA-Z]{2}-[0-9]{1,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);
        boolean correctPlate = matcher1.matches();

        if(correctPlate){
            System.out.println("Your inputted plate number is correct");
        }else {
            System.out.println("Your inputted plate number is not correct");
        }



    }
}
