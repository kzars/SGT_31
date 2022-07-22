public class LoopsBreakContinue {
    public static void main(String[] args) {

        //break to stop loops before end
        for (int i = 0; i < 10; i++){
            System.out.println("Hello world");
            if(i == 4){
                break;
            }
        }

        //continue - for skipping current iteration of loop
        for(int i = 1; i <= 10; i++){

            if(i == 4 || i == 9){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
