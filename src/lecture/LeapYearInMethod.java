package lecture;

import java.util.Scanner;

public class LeapYearInMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any year");
        int year = scanner.nextInt();
        determinLeapYear(year);
        determinLeapYear(2004);
        determinLeapYear(1992);

    }

    public static void determinLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

/*    public static String determinLeapYear1(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){

        } else {

        }
    }*/

}
