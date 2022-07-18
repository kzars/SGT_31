public class Operators {
    public static void main(String[] args) {

        //Math operators + - / * %
        int x = 100;
        x += 100;
        //x = x + 100;
        //x = 3;
        System.out.println("x = " + x);

        System.out.println(20 * 100);

        //INCREMENTATION OPERATORS
        //Post-incrementation
        int num = 10;
        System.out.println("num = " + num++);
        System.out.println("num = " + num);

        //Pre-incrementation
        int num2 = 20;
        System.out.println("num2 = " + ++num2);

        //Increase or decrease variable by one
        int var = 10;
        var += 1;
        var = var + 1;
        ++var;
        var++;

        var -= 1;
        var = var - 1;
        --var;
        var--;

        //RELATION operators
        // Equality ==
        int a = 1;
        int b = 10;
        System.out.println("Equality = " + (a == b)); //is a equal to b?

        //Inequality !=
        System.out.println("Inequality - " + (a != b)); // is a not equal to b?

        //Greater than > and greater than or equal to >=
        System.out.println(a > b); //if a is greater than b
        System.out.println(a >= b); // if a is greater or equal to b

        //Less than < and less than or equal to <=
        System.out.println(a < b);
        System.out.println(a <= b);

        //Logical operators
        //Logical AND - &&
        boolean wind = true;
        boolean weather = true;
        System.out.println(wind && weather);

        //Logical OR - ||
        boolean sale = false;
        boolean rich = true;
        System.out.println(sale || rich);



    }
}
