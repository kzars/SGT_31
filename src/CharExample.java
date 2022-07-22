public class CharExample {
    public static void main(String[] args) {

        char ch = 'M';
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //Cast from int to char
        System.out.println((char) 122);

        //Print out all lower case alphabet letters --> a b c d e ...
        for (int i = 97; i <= 122; i++){
            System.out.print((char)i + " ");
        }




    }
}
