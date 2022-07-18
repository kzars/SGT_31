import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");

        float speed = scanner.nextFloat();
        System.out.println(speed + "mp/h in km/h would be equal to  "+ speed * 1.6f +" km/h");

    }
}
