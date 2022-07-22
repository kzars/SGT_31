import com.sun.security.jgss.GSSUtil;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declare Array that will hold 3 String type variables
        String[] names = new String[3];

        //How to set array's element values
        names[0] = "Kārlis";
        names[1] = "Jānis";
        names[2] = "Pēteris";

        //How to get array's elements value
        System.out.println(names[0]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 9;
        grades[2] = 1;
        grades[3] = 7;
        grades[4] = 5;
        grades[5] = 2;
        grades[6] = 9;
        grades[7] = 10;
        grades[8] = 6;
        grades[9] = 4;

        //How to get Array's size
        System.out.println("Array's size: " + grades.length);

        //Print out all elements
        for(int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");
        }


    }
}
