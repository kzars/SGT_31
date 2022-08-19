package oop;

enum Level{
    EASY,MEDIUM,HARD
}

public class EnumExample {
    public static void main(String[] args) {

        Level myLevel = Level.MEDIUM;

        switch (myLevel){
            case EASY:
                System.out.println("Level: easy");
                break;
            case MEDIUM:
                System.out.println("Level: medium");
                break;
            case HARD:
                System.out.println("Level: hard");
                break;
        }
    }
}
