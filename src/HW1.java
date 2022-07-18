import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = scanner.nextLine();

        System.out.println("Please enter your date of birth");

        int dateOfBirth = scanner.nextInt();

        System.out.println("Your name is " + name + " and you are " + (2022 - dateOfBirth) + " year old");

    }
}
