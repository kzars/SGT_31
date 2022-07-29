public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] age = new int[][]{{4,5,3,6,5},{34,44,28,38,41}};
        //Print second column values
        System.out.println("Child - " + age[0][1]);
        System.out.println("Parent - " + age[1][1]);

        // Example 2
        String[][] names = new String[2][5]; // 2 rows and 5 columns

        //1'st row
        names[0][0] = "Alice";
        names[0][1] = "Bob";
        names[0][2] = "John";
        names[0][3] = "Lucas";
        names[0][4] = "Joshua";

        //2'nd row
        names[1][0] = "Tyron";
        names[1][1] = "Daren";
        names[1][2] = "Israel";
        names[1][3] = "Cyril";
        names[1][4] = "Lewis";

        //Number of rows in 2d Array
        System.out.println(names.length);

        //Number of columns in specific row
        System.out.println(names[0].length);

        // i - rows
        // j = columns

        for (int i = 0; i < names.length; i++){
            System.out.print("Row no. " + (i+1) + "-  ");
            for (int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

        for (String [] tempNames : names){
            System.out.print("Row - ");
            for (String name : tempNames) {
                System.out.print(name + " ");
            }
            System.out.println();
        }






    }
}
