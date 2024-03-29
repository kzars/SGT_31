package lecture;

import java.util.Scanner;

public class LeapYearInMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("basics.Input any year");
        int year = scanner.nextInt();
        determinLeapYear(year);
        determinLeapYear(2004);
        determinLeapYear(1992);

        String result = determinLeapYearString(1853);
        System.out.println(result);

    }

    public static void determinLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static String determinLeapYearString(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            return year + " Leap year";
        } else {
            return  year + " Not a leap year";
        }
    }

/*    public static String determinLeapYear1(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){

        } else {

        }
    }*/

}
