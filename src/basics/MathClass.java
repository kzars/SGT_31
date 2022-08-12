package basics;

public class MathClass {
    public static void main(String[] args) {

        float num = 5.999999999999f;
        System.out.println(num);

        //Rounding down
        System.out.println(Math.floor(num));

        //Rounding up
        System.out.println(Math.ceil(num));

        //Rounding according to Math principles
        System.out.println(Math.round(num));

        //Absolute value
        System.out.println(Math.abs(-2));

        //Power
        System.out.println(Math.pow(6,2));

        //Square root
        System.out.println(Math.sqrt(64));

        //Finding max value between two values
        System.out.println(Math.max(103.6,100));

        //Finding min value between two values
        System.out.println(Math.min(55,43));

        //Random value (1-20)
        System.out.println((int) (Math.random() * 20) + 1);

        //Casting
        System.out.println((int) 99.989);

        System.out.println((10 + 5) * 2);
    }
}
